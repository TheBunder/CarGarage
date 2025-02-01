import java.util.concurrent.TimeUnit;

public class Car extends Vehicle{
    protected Car() {
        super(5, new Repairable() {
            @Override
            public void repair() {
                System.out.println("Repair: Oil changed");
            }
        });
    }

    @Override
    void moveForward() {
        System.out.println("Vroom Vroom");
    }


}
