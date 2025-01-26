import java.util.ArrayList;

public class DB {
    private Vehicle[] vehicles =  new Vehicle[50]; // The garage have a limit so it cannot be ArrayList
    private int index = 0;
    public void addVehicle(Vehicle vehicle){
        vehicles[index]=vehicle;
        index++;
    }

    public Vehicle[] getVehicles(){
        return vehicles;
    }
}
