# CodeAlpha Cloud Projects

My clean submissions for the cloud computing internship tasks. Built and managed entirely on-cloud.

## Task 1: Log Redundancy Cleaner
A lightweight Java console utility that cleans high-frequency network log streams by destroying redundant tracking rows on the fly before they hit database physical storage layers.

### Implementation:
* Leverages a structural `HashSet` for tracking data packets.
* Performs lightning-fast execution checks at $O(1)$ constant time complexity.

---

## Task 2: Cloud Distributed Rate Limiter
A token-bucket simulation system designed for API Gateways to throttle spam traffic, control cloud resource usage, and protect server architectures from crashing during intense request spikes.

### Implementation:
* Employs token-bucket regeneration algorithms using high-precision tracking (`System.nanoTime()`).
* Implements synchronization logic (`synchronized`) to ensure thread safety across distributed worker paths.

### Simulated Network Profile Output:
```text
--- Cloud API Gateway Rate Limiter Active ---

[SIMULATION] Processing rapid burst of 5 requests...
  -> [200 OK] Request processed for IP: 192.168.1.1
  -> [200 OK] Request processed for IP: 192.168.1.2
  -> [200 OK] Request processed for IP: 192.168.1.3
  -> [429 TOO MANY REQUESTS] Dropped packet from IP: 192.168.1.4
  -> [429 TOO MANY REQUESTS] Dropped packet from IP: 192.168.1.5

[SIMULATION] Sleeping for 1.5 seconds to allow token regeneration...

[SIMULATION] New request arrives after window cool-down:
  -> [200 OK] Request processed for IP: 192.168.1.6
