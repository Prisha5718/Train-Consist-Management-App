/**
 * UC19 - Binary Search for sorted bogie IDs
 */
public class UC19_BinarySearchBogieID {

    public static void main(String[] args) {

        System.out.println("=== UC19: Binary Search Bogie ID ===");

        // Sorted array of bogie IDs
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        String searchKey = "BG309";

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;
        int position = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = searchKey.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                position = mid;
                break;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (found) {
            System.out.println("Bogie ID found at position: " + position);
        } else {
            System.out.println("Bogie ID not found.");
        }

        System.out.println("Program continues...");
    }
}
