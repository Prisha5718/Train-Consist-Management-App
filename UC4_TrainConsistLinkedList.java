import java.util.LinkedList;

/**
 * UC4 - Train Consist using LinkedList
 * Demonstrates dynamic insertion and deletion of bogies
 */
public class UC4_TrainConsistLinkedList {

    public static void main(String[] args) {

        System.out.println("=== UC4: Train Consist LinkedList Management ===");

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add initial bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial consist: " + trainConsist);

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("After inserting Pantry Car: " + trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Final consist
        System.out.println("Final ordered train consist: " + trainConsist);
    }
}