# CodeAlpha Cloud Systems Optimization Infrastructure

Production-ready backend utilities simulating highly scalable, reliable distributed systems architectures.

## 🛠️ Core Engine Portfolios

### Task 1: Stream Deduplication Engine (`LogRedundancyCleaner.java`)
An algorithmic pipeline simulating real-time metric filtering engines. It intercepts system logs at high frequencies and eliminates redundant rows dynamically before they corrupt physical persistent clusters.
* **Architecture:** In-memory tracking array evaluated via standard `HashSet` mechanisms.
* **Performance:** High-velocity lookup running on $O(1)$ time complexity limits.

### Task 2: Elastic API Gateway Rate Limiter (`CloudRateLimiter.java`)
A thread-safe infrastructure mitigation script mimicking perimeter web firewall traffic management profiles.
* **Architecture:** Token-Bucket algorithm processing high-precision timestamps via `System.nanoTime()`.
* **Mitigation:** Drops spam payloads gracefully using automated `429 Too Many Requests` responses.

### Task 3: High-Availability Distributed Storage (`DistributedCache.java`)
A memory storage cache grid mirroring clustering synchronization topologies found in tools like Redis or Apache Cassandra.
* **Architecture:** Multi-Node configuration featuring transactional routing topologies.
* **Fault Tolerance:** Active-Passive Replication architecture ensuring direct data consistency across distributed endpoints.

---

## 🚀 Simulated Operational Logs

```text
--- Booting Distributed Cloud Cache Clusters ---

[TRAFFIC] Client issues a heavy write request to primary node...
[us-east-primary -> Master Write] Saved: user_session_9982 = ACTIVE_AUTH_TOKEN_XYZ
  -> [us-west-replica -> Replica Sync] Data synced successfully.
  -> [eu-central-replica -> Replica Sync] Data synced successfully.

[VERIFICATION] Querying backup follower instances directly to confirm data integrity:
  Query us-west-replica   : ACTIVE_AUTH_TOKEN_XYZ
  Query eu-central-replica : ACTIVE_AUTH_TOKEN_XYZ

--- Distributed Data Persistence Test Successful ---
