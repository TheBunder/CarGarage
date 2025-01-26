import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Garage garage;
        DB db = new DB();
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a vehicle type:");
        System.out.println("1. Motorcycle");
        System.out.println("2. Car");
        System.out.println("3. Truck");
        for (int i = 0; i < 50; i++) {
            try {
                input = Integer.parseInt(scanner.nextLine());

                switch (input) {
                    case 1 -> db.addVehicle(new Motorcycle());
                    case 2 -> db.addVehicle(new Car());
                    case 3 -> db.addVehicle(new Truck());
                    default -> System.out.println("Please enter only 1, 2, or 3");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        garage = new Garage(db.getVehicles());
        garage.start();
    }
}