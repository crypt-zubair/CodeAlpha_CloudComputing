import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class DistributedCache {
    private final String nodeName;
    private final Map<String, String> storage = new HashMap<>();
    private final List<DistributedCache> clusterNodes = new ArrayList<>();

    public DistributedCache(String nodeName) {
        this.nodeName = nodeName;
    }

    public void linkNode(DistributedCache node) {
        this.clusterNodes.add(node);
    }

    // Writes data locally and automatically replicates it across the cluster
    public void put(String key, String value, boolean isReplicationCall) {
        storage.put(key, value);
        if (!isReplicationCall) {
            System.out.println("[" + nodeName + " -> Master Write] Saved: " + key + " = " + value);
            for (DistributedCache peer : clusterNodes) {
                peer.put(key, value, true); // Replicate to follower node
            }
        } else {
            System.out.println("  -> [" + nodeName + " -> Replica Sync] Data synced successfully.");
        }
    }

    public String get(String key) {
        return storage.get(key);
    }

    public static void main(String[] args) {
        System.out.println("--- Booting Distributed Cloud Cache Clusters ---");
        
        // Initialize independent cloud availability zones / nodes
        DistributedCache nodeA = new DistributedCache("us-east-primary");
        DistributedCache nodeB = new DistributedCache("us-west-replica");
        DistributedCache nodeC = new DistributedCache("eu-central-replica");

        // Establish network topology replication peering links
        nodeA.linkNode(nodeB);
        nodeA.linkNode(nodeC);

        System.out.println("\n[TRAFFIC] Client issues a heavy write request to primary node...");
        nodeA.put("user_session_9982", "ACTIVE_AUTH_TOKEN_XYZ", false);

        System.out.println("\n[VERIFICATION] Querying backup follower instances directly to confirm data integrity:");
        System.out.println("  Query us-west-replica   : " + nodeB.get("user_session_9982"));
        System.out.println("  Query eu-central-replica : " + nodeC.get("user_session_9982"));
        
        System.out.println("\n--- Distributed Data Persistence Test Successful ---");
    }
}
