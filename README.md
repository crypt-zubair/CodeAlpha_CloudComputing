# My Cloud Computing Internship Projects (CodeAlpha)

Hey there! Welcome to my repository for the CodeAlpha Cloud Computing internship. This repo contains the hands-on projects I built during the program. Instead of just writing basic scripts, I added some real-world logic—like user limitations and paywall simulations—to make them feel like actual applications you'd encounter in production.

Both tools are written in Java and run right inside your terminal or command prompt.

---

## 🛠️ What I Built

### 1. Cloud Log Cleaner (`LogRedundancyCleaner.java`)
In cloud environments, storage fills up fast with repeating data. This tool acts as a live background system that watches an incoming data stream. It keeps track of unique lines, lets them through, and instantly filters out any duplicates to save server space.

* **The Twist:** I added a "Free Tier" restriction. If you type words like `free_tier` or `basic_user`, the program blocks the data stream and simulates a premium account lock to mimic real corporate software.
* **Safety First:** It includes an explicit warning message so users know it's a safe simulation.

### 2. Live Cloud Support Chatbot (`CloudChatbot.java`)
This is an interactive command-line helper designed to answer common customer questions about cloud pricing, server uptime, security, and technical support.

* **The Upgrade:** If a user tries to access advanced data by typing `unlock pro` or `premium`, the bot stops them with a mock payment required warning and links them to a fake billing portal framework.
* **Smart Navigation:** If a user types total gibberish, the bot doesn't just crash or fail silently—it catches the mistake and prints a helpful guide showing exactly what keywords to use.

---

## 🚀 How to Run and Test the Code

Make sure you have Java installed on your computer. Open your terminal or VS Code, navigate to this project folder, and run the following commands.

### Running the Log Cleaner:
```bash
javac LogRedundancyCleaner.java
java LogRedundancyCleaner
