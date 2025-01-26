import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Garage {
    private Vehicle[] vehicles;

    public Garage(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void start() {
        new Thread(() -> {
            for (int i = 0; i < vehicles.length; i++) {
                try {
                    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
                    executor.scheduleAtFixedRate(vehicles[i].repair(), 0, 1, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    System.out.println("Opps! There was an exception: "+e);
                }

            }
        }).start();
    }
}
