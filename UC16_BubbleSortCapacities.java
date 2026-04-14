/**
 * UC16 - Bubble Sort for passenger bogie capacities
 */
public class UC16_BubbleSortCapacities {

    public static void main(String[] args) {

        System.out.println("=== UC16: Bubble Sort Capacities ===");

        // Array of capacities
        int[] capacities = {72, 24, 90, 78, 60};

        // Bubble Sort logic
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - 1 - i; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.println("Sorted Capacities:");

        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }

        System.out.println("\nProgram continues...");
    }
}