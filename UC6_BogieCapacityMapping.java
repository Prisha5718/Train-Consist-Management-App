import java.util.HashMap;
import java.util.Map;

/**
 * UC6 - Bogie Capacity Mapping
 * Associates each bogie with its seating/load capacity
 */
public class UC6_BogieCapacityMapping {

    public static void main(String[] args) {

        System.out.println("=== UC6: Bogie Capacity Mapping ===");

        // Create HashMap for bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert key-value pairs
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 78);
        bogieCapacity.put("First Class", 24);

        // Display capacity details
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Program continues...");
    }
}
