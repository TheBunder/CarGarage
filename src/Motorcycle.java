import java.util.concurrent.TimeUnit;

public class Motorcycle extends Vehicle{
    protected Motorcycle() {
        super(3);
    }

    @Override
    void moveForward() {
        System.out.println("Roar Roar");
    }

    @Override
    public void repair(){
        try{
            TimeUnit.SECONDS.sleep(super.fixTime);
            System.out.println("Repair: Two wheels replaced");
        } catch (InterruptedException e) {
            System.err.println("Repair interrupted for " + e);
        }
    }
}
