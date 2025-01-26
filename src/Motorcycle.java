public class Motorcycle extends Vehicle{
    protected Motorcycle(int fixTime) {
        super(1000*3);
    }

    @Override
    void moveForward() {
        System.out.println("Roar Roar");
    }

    @Override
    public void repair() {
        System.out.println("Repair: Two wheels replaced");
    }
}
