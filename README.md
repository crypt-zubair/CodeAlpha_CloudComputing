# CodeAlpha Cloud Projects

Hey there! This repository holds my cloud computing internship submissions. 

## Task 1: Log Redundancy Cleaner
A lightweight Java console app that parses network log streams and filters out redundant tracking data in real-time. It mimics how cloud monitoring tools save storage costs by deduplicating logs before writing them to disk.

### How it works:
* Uses a `HashSet` to ingest incoming log strings.
* Leverages $O(1)$ hashing checks to instantly drop duplicate requests without scanning the whole dataset sequentially.
* Keeps memory overhead low for scaling up to massive telemetry logs.

### Sample Telemetry Output:
--- Cloud Data Redundancy Removal System ---
[REDUNDANT PACKET BLOCKED]: 66.249.65.107 - - [11/Jul/2026:10:00:01] "GET /index.html HTTP/1.1" 200
[REDUNDANT PACKET BLOCKED]: 192.168.1.50 - - [11/Jul/2026:10:00:02] "POST /login HTTP/1.1" 200

--- Cloud Deduplication Metrics Summary ---
Total Network Streams Processed : 5
Redundant Storage Logs Destroyed: 2
Clean Unique Database Logs Saved: 3
