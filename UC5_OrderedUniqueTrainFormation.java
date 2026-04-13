import java.util.LinkedHashSet;

/**
 * UC5 - Ordered Unique Train Formation
 * Maintains insertion order while preventing duplicates
 */
public class UC5_OrderedUniqueTrainFormation {

    public static void main(String[] args) {

        System.out.println("=== UC5: Ordered Unique Train Formation ===");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate insertion
        trainFormation.add("Sleeper");

        // Display final formation
        System.out.println("Final Train Formation: " + trainFormation);

        System.out.println("Program continues...");
    }
}