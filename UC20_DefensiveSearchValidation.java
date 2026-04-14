import java.util.ArrayList;
import java.util.List;

/**
 * UC20 - Prevent search on empty train using IllegalStateException
 */
public class UC20_DefensiveSearchValidation {

    public static void main(String[] args) {

        System.out.println("=== UC20: Defensive Search Validation ===");

        // Empty bogie collection
        List<String> bogies = new ArrayList<>();

        try {
            searchBogie(bogies, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }

    public static void searchBogie(List<String> bogies, String searchKey) {

        // Defensive check
        if (bogies.isEmpty()) {
            throw new IllegalStateException(
                    "Search cannot be performed. Train has no bogies."
            );
        }

        // Search logic would continue here
        System.out.println("Searching for: " + searchKey);
    }
}