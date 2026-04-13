import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * UC7 - Sort bogies by seating capacity using Comparator
 */
public class UC7_BogieCapacitySorting {

    // Bogie class
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

        System.out.println("=== UC7: Bogie Capacity Sorting ===");

        // Create list of bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("First Class", 24));

        // Sort using Comparator
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Sorted Bogies by Capacity:");

        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        System.out.println("Program continues...");
    }
}