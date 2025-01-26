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
        System.out.println("Repair: Oil changed");
    }
}
