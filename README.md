# CodeAlpha Cloud Computing Intern Tasks

Official project workspace for assigned cloud infrastructure and automation workloads.

## 🛠️ Implemented Modules

### Task 1: Data Redundancy Removal System (`LogRedundancyCleaner.java`)
A high-throughput text streaming processor that filters out duplicate data entries before they reach internal storage databases.
* **Architecture:** Uses `java.util.HashSet` tracking to isolate payloads.
* **Edge Cases:** Cleans whitespace corruptions and drops empty/null frames at $O(1)$ constant velocity.

### Task 4: Commercial AI Chatbot Engine (`CloudChatbot.java`)
A retrieval-based web-interactive assistant that provides instant feedback to users by running keyword verification matrices over defined query signatures.
* **Architecture:** Pattern-matching rules run over static keyword hash mapping buckets.
* **Scope:** Tailored for corporate queries covering cloud pricing tiers, security parameters, and SLAs.
