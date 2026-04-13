import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * UC8 - Filter bogies using Stream API
 */
public class UC8_BogieStreamFiltering {

    // Reusing Bogie class concept from UC7
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC8: Stream Filtering of Bogies ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Stream filtering
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("Bogies with capacity > 60:");

        for (Bogie bogie : filteredBogies) {
            System.out.println(bogie);
        }

        System.out.println("Program continues...");
    }
}
