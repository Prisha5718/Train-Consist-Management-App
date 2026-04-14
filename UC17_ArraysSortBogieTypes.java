import java.util.Arrays;

/**
 * UC17 - Sort bogie type names using Arrays.sort()
 */
public class UC17_ArraysSortBogieTypes {

    public static void main(String[] args) {

        System.out.println("=== UC17: Arrays.sort() for Bogie Types ===");

        // Array of bogie type names
        String[] bogieTypes = {
                "Sleeper",
                "Cargo",
                "First Class",
                "AC Chair",
                "General"
        };

        // Sort alphabetically
        Arrays.sort(bogieTypes);

        // Display sorted result
        System.out.println("Sorted Bogie Types:");
        System.out.println(Arrays.toString(bogieTypes));

        System.out.println("Program continues...");
    }
}