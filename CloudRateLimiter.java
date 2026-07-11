import java.util.concurrent.TimeUnit;

public class CloudRateLimiter {
    private final int limit;
    private int tokens;
    private long lastCheck;
    private final long refillDelta;

    public CloudRateLimiter(int limit, int ratePerSec) {
        this.limit = limit;
        this.tokens = limit;
        this.lastCheck = System.nanoTime();
        this.refillDelta = TimeUnit.SECONDS.toNanos(1) / ratePerSec;
    }

    public synchronized boolean throttle() {
        long currentNanos = System.nanoTime();
        long diff = currentNanos - lastCheck;
        
        if (diff >= refillDelta) {
            int fillAmount = (int) (diff / refillDelta);
            if (fillAmount > 0) {
                this.tokens = Math.min(limit, this.tokens + fillAmount);
                this.lastCheck = currentNanos;
            }
        }

        if (this.tokens > 0) {
            this.tokens--;
            return false; // Allowed, do not throttle
        }
        return true; // Throttle request
    }

    public static void main(String[] args) throws Exception {
        CloudRateLimiter gatewayGuard = new CloudRateLimiter(3, 1);
        String[] clientIps = {"192.168.1.1", "192.168.1.2", "192.168.1.3", "192.168.1.4"};

        System.out.println("Evaluating gateway cluster constraints...");
        for (String ip : clientIps) {
            if (gatewayGuard.throttle()) {
                System.out.println("IP " + ip + " rejected -> HTTP 429");
            } else {
                System.out.println("IP " + ip + " accepted -> HTTP 200");
            }
        }
    }
}
