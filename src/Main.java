import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Garage garage;
        DB db = new DB();
        garage = new Garage(db.getVehicles());

        Thread inputThread = new Thread(() -> {
            int input = -1;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a vehicle type:");
            System.out.println(VehicleType.MOTORCYCLE.value + ". Motorcycle");
            System.out.println(VehicleType.CAR.value + ". Car");
            System.out.println(VehicleType.TRUCK.value + ". Truck");
            while (input != 0) {
                try {
                    input = Integer.parseInt(scanner.nextLine());
                    if (input == 0) {
                        continue;
                    }

                    switch (VehicleType.getById(input)) {
                        case MOTORCYCLE -> db.addVehicle(new Motorcycle());
                        case CAR -> db.addVehicle(new Car());
                        case TRUCK -> db.addVehicle(new Truck());
                        default -> System.out.println("Please enter only 1, 2, or 3");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }
        });
        Thread printThread = new Thread(garage);

        printThread.start();
        inputThread.start();
    }
}