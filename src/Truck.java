import java.util.concurrent.TimeUnit;

public class Truck extends Vehicle{
    protected Truck() {
        super(10, new Repairable() {
            @Override
            public void repair() {
                System.out.println("Repair: Horn fluid filled");
            }
        });
    }

    @Override
    void moveForward() {
        System.out.println("Rumble Rumble");
    }
}
