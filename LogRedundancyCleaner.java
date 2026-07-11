import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LogRedundancyCleaner {
    private final Set<String> savedLogs = new HashSet<>();

    public void checkLog(String logLine) {
        if (logLine == null || logLine.trim().isEmpty()) {
            return;
        }

        String cleanLine = logLine.trim();

        if (cleanLine.toLowerCase().contains("free_tier") || cleanLine.toLowerCase().contains("basic_user")) {
            System.out.println("\n[🔒 FEATURE LOCKED]");
            System.out.println("This advanced log sorting feature is only available for premium accounts.");
            System.out.println("To unlock full access, view our plans here:");
            System.out.println("👉 https://crypt-zubair.github.io/CodeAlpha_CloudComputing/billing_portal.html\n");
            System.out.println("⚠️ [PROTOTYPE NOTICE]: This is a fake link for a school project. Do not pay real money.");
            return;
        }

        if (savedLogs.contains(cleanLine)) {
            System.out.println("[DUPLICATE BLOCKED] -> This exact line was already processed.");
        } else {
            savedLogs.add(cleanLine);
            System.out.println("[SAVED NEW LINE]    -> This line is unique.");
        }
    }

    public static void main(String[] args) {
        LogRedundancyCleaner cleaner = new LogRedundancyCleaner();
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================================");
        System.out.println("===       CLOUD LOG CLEANER PROTOTYPE LIVE         ===");
        System.out.println("======================================================");
        System.out.println("📝 HOW TO TEST THIS PROGRAM:");
        System.out.println("1. Type any text (e.g., 'error404') -> It will be SAVED.");
        System.out.println("2. Type the same text again         -> It will be BLOCKED.");
        System.out.println("3. Type 'free_tier'                 -> It will trigger the PREMIUM LOCK & WARNING.");
        System.out.println("4. Type 'exit'                      -> It will stop the program cleanly.");
        System.out.println("------------------------------------------------------");

        while (true) {
            System.out.print("\nEnter Log Input: ");
            if (!scanner.hasNextLine()) break;
            String input = scanner.nextLine();

            if (input.trim().equalsIgnoreCase("exit")) {
                System.out.println("Stopping the log program. Goodbye!");
                break;
            }

            cleaner.checkLog(input);
        }

        scanner.close();
    }
}
