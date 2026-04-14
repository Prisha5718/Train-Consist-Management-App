/**
 * UC18 - Linear Search for bogie ID
 */
public class UC18_LinearSearchBogieID {

    public static void main(String[] args) {

        System.out.println("=== UC18: Linear Search Bogie ID ===");

        // Unsorted array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String searchKey = "BG309";

        boolean found = false;
        int position = -1;

        // Linear search
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                position = i;
                break; // early termination
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie ID found at position: " + position);
        } else {
            System.out.println("Bogie ID not found.");
        }

        System.out.println("Program continues...");
    }
}