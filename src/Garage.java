import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

public class Garage implements Runnable{
    private HashMap<VehicleType, PriorityQueue<Vehicle>> vehicles;

    public Garage(HashMap<VehicleType, PriorityQueue<Vehicle>> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public void run() {
        Vehicle vehicle;
        while (true){
            if (!vehicles.get(VehicleType.MOTORCYCLE).isEmpty()){
                vehicle = vehicles.get(VehicleType.MOTORCYCLE).poll();
            } else if (!vehicles.get(VehicleType.CAR).isEmpty()){
                vehicle = vehicles.get(VehicleType.CAR).poll();
            }
            else if (!vehicles.get(VehicleType.TRUCK).isEmpty()){
                vehicle = vehicles.get(VehicleType.TRUCK).poll();
            }
            else{
                continue;
            }
            try {
                TimeUnit.SECONDS.sleep(1); // One second
                vehicle.repair();

            } catch (InterruptedException | NullPointerException e) {
                System.out.println("Opps! There was an exception: "+e);
            }
        }
    }
}
