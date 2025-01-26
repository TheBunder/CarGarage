public class Main {
    private static Garage garage;
    private static DB db;
    public static void main(String[] args) {
        garage = new Garage(db.getVehicles());
        garage.start();
    }
}