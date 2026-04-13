import java.util.ArrayList;
import java.util.List;

/**
 * UC10 - Aggregate seating capacities using Stream reduction
 */
public class UC10_TotalSeatingCapacity {

    // Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC10: Total Seating Capacity ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Stream pipeline: map + reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Display result
        System.out.println("Total Seating Capacity: " + totalCapacity);

        System.out.println("Program continues...");
    }
}