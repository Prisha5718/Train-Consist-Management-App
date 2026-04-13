import java.util.ArrayList;
import java.util.List;

/**
 * UC1 - Application Initialization
 */
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train consist initialized successfully.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        System.out.println("System ready for further operations.");
    }
}