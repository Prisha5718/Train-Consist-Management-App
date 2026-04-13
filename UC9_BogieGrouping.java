import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * UC9 - Group bogies into categories using Stream collectors
 */
public class UC9_BogieGrouping {

    // Bogie class
    static class Bogie {
        String name;
        String category;
        int capacity;

        Bogie(String name, String category, int capacity) {
            this.name = name;
            this.category = category;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC9: Bogie Grouping using Stream Collectors ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper A1", "Passenger", 72));
        bogies.add(new Bogie("Sleeper A2", "Passenger", 72));
        bogies.add(new Bogie("Cargo C1", "Cargo", 100));
        bogies.add(new Bogie("Cargo C2", "Cargo", 120));
        bogies.add(new Bogie("Guard G1", "Service", 2));

        // Group by category
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.category));

        // Display grouped structure
        System.out.println("Grouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Program continues...");
    }
}