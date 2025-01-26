import java.util.concurrent.TimeUnit;

public class Garage {
    private Vehicle[] vehicles;

    public Garage(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void start() {
        for (int i = 0; i < vehicles.length; i++) {
            try {
                TimeUnit.SECONDS.sleep(1); // One second
                vehicles[i].repair();

            } catch (InterruptedException e) {
                System.out.println("Opps! There was an exception: "+e);
            }

        }
    }
}
