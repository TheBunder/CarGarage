import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class DB {
    private final HashMap<VehicleType, PriorityQueue<Vehicle>> vehicles =  new HashMap<>();

    private class DontComparator implements Comparator<Vehicle> {
        @Override
        public int compare(Vehicle v1, Vehicle v2) {
            return 0;
        }
    }

    public DB() {
        vehicles.put(VehicleType.MOTORCYCLE, new PriorityQueue<>(new DontComparator()));
        vehicles.put(VehicleType.CAR, new PriorityQueue<>(new DontComparator()));
        vehicles.put(VehicleType.TRUCK, new PriorityQueue<>(new DontComparator()));
    }

    public void addVehicle(Vehicle vehicle){
        if (vehicle instanceof Motorcycle){
            vehicles.get(VehicleType.MOTORCYCLE).add(vehicle);
        }
        else if (vehicle instanceof Car){
            vehicles.get(VehicleType.CAR).add(vehicle);
        }
        else if (vehicle instanceof Truck){
            vehicles.get(VehicleType.TRUCK).add(vehicle);
        }
        else {
            System.out.println("I have no clue what this is");
        }
    }

    public HashMap<VehicleType, PriorityQueue<Vehicle>> getVehicles(){
        return vehicles;
    }
}
