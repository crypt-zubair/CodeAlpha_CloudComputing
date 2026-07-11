# CodeAlpha Cloud Projects

Code submissions for my cloud computing internship tasks. Built and managed directly on GitHub.

## Project Modules

### 1. Log Redundancy Cleaner (`LogRedundancyCleaner.java`)
A basic pipeline tool that catches duplicate network log lines on the fly before they eat up physical server storage. 
* **Logic:** Uses a `HashSet` to process log packets at $O(1)$ constant time.
* **Edge Cases handled:** Drops null entries and completely blank or corrupted string inputs automatically using `.trim()`.

### 2. Cloud Gateway Rate Limiter (`CloudRateLimiter.java`)
A lightweight, thread-safe token bucket implementation to throttle massive traffic spikes and protect server resources.
* **Logic:** Calculates token refills dynamically based on high-precision system time (`System.nanoTime()`).
* **Handling:** Drops excessive traffic by returning a boolean state indicating a throttle breach (`HTTP 429`).

### 3. Distributed Key-Value Memory Cache (`DistributedCache.java`)
A multi-node cluster data store simulation mimicking primary-replica replication models like Redis.
* **Logic:** Automatically forwards local data mutations to peered follower nodes.
* **Verification:** Confirms active cluster sync by reading straight from backup nodes.
