public class Truck extends Vehicle{
    protected Truck(int fixTime) {
        super(1000*10);
    }

    @Override
    void moveForward() {
        System.out.println("Rumble Rumble");
    }

    @Override
    public void repair() {
        System.out.println("Repair: Horn fluid filled");
    }
}
