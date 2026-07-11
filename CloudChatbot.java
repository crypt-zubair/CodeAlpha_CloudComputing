import java.util.HashMap;
import java.util.Map;

public class CloudChatbot {
    private final Map<String, String> knowledgeBase = new HashMap<>();

    public CloudChatbot() {
        // Predefined commercial input patterns
        knowledgeBase.put("pricing", "Standard tier is $29/mo. Enterprise custom deployments start at $499/mo.");
        knowledgeBase.put("uptime", "Our cloud architecture guarantees a 99.99% SLA uptime across all regions.");
        knowledgeBase.put("security", "All data layers are encrypted at rest using AES-256 and TLS 1.3 in transit.");
        knowledgeBase.put("support", "24/7/365 premium engineer support is available via the corporate dashboard.");
    }

    public String respond(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "System alert: Received empty query stream.";
        }
        
        String cleanInput = input.toLowerCase().trim();
        
        // Pattern matching loop
        for (String keyword : knowledgeBase.keySet()) {
            if (cleanInput.contains(keyword)) {
                return knowledgeBase.get(keyword);
            }
        }
        
        return "I'm sorry, that query does not match our defined cloud matrix keywords (pricing, uptime, security, support).";
    }

    public static void main(String[] args) {
        CloudChatbot bot = new CloudChatbot();
        
        // Mocking user interactions for the execution log video
        String[] testQueries = {
            "What is your pricing model?",
            "Tell me about system security protocols",
            "Is there 24/7 support available?",
            "random gibberish text"
        };

        System.out.println("--- AI Retrieval Chatbot Active ---");
        System.out.println("Awaiting network query frames...\n");

        for (String query : testQueries) {
            System.out.println("User Query: " + query);
            System.out.println("Bot Response: " + bot.respond(query));
            System.out.println("------------------------------------------------");
        }
    }
}
