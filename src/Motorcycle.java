import java.util.concurrent.TimeUnit;

public class Motorcycle extends Vehicle{
    protected Motorcycle() {
        super(3, new Repairable() {
            @Override
            public void repair(){
                System.out.println("Repair: Two wheels replaced");
            }
        });
    }

    @Override
    void moveForward() {
        System.out.println("Roar Roar");
    }


}
