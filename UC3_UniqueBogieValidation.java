import java.util.HashSet;
import java.util.Set;

/**
 * UC3 - Unique Bogie Validation
 * Ensures duplicate bogie IDs are not added
 */
public class UC3_UniqueBogieValidation {

    public static void main(String[] args) {

        System.out.println("=== UC3: Unique Bogie Validation ===");

        // Create a Set to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG102"); // Duplicate
        bogieIds.add("BG101"); // Duplicate

        // Display unique bogie IDs
        System.out.println("Unique bogie IDs in the train:");
        System.out.println(bogieIds);

        System.out.println("Total unique bogies: " + bogieIds.size());
    }
}