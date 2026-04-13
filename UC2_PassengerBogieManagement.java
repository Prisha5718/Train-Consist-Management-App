import java.util.ArrayList;

/**
 * UC2 - Passenger Bogie Management
 * Demonstrates dynamic insertion and removal using ArrayList
 */
public class UC2_PassengerBogieManagement {

    public static void main(String[] args) {

        System.out.println("=== UC2: Passenger Bogie Management ===");

        // Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display list after insertion
        System.out.println("Bogies after addition: " + passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        // Check existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the consist.");
        } else {
            System.out.println("Sleeper bogie does not exist.");
        }

        // Final list state
        System.out.println("Final bogie list: " + passengerBogies);

        System.out.println("Program continues...");
    }
}
