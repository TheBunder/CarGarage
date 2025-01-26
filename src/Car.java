import java.util.concurrent.TimeUnit;

public class Car extends Vehicle{
    protected Car() {
        super(1000*5);
    }

    @Override
    void moveForward() {
        System.out.println("Vroom Vroom");
    }

    @Override
    public void repair() {
        try {
            TimeUnit.SECONDS.sleep(super.fixTime);
            System.out.println("Repair: Oil changed");
        } catch (InterruptedException e) {
            System.err.println("Repair interrupted for " + e);
        }
    }
}
