/**
 * UC15 - Handle unsafe cargo assignments using try-catch-finally
 */
public class UC15_CargoSafetyHandling {

    // Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        CargoSafetyException(String message) {
            super(message);
        }
    }

    // Goods Bogie Class
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                // Business rule validation
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException(
                            "Unsafe assignment: Petroleum cannot be loaded into a rectangular bogie."
                    );
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned successfully: " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Assignment process completed.");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC15: Cargo Safety Handling ===");

        GoodsBogie bogie = new GoodsBogie("Rectangular");

        // Unsafe assignment
        bogie.assignCargo("Petroleum");

        System.out.println("Program continues safely...");
    }
}