import java.util.concurrent.TimeUnit;

public class Truck extends Vehicle{
    protected Truck() {
        super(1000*10);
    }

    @Override
    void moveForward() {
        System.out.println("Rumble Rumble");
    }

    @Override
    public void repair() {
        try {
            TimeUnit.SECONDS.sleep(super.fixTime);
            System.out.println("Repair: Horn fluid filled");
        } catch (InterruptedException e) {
            System.err.println("Repair interrupted for " + e);
        }
    }
}
