public abstract class Vehicle implements Repairable{
    protected final int fixTime;

    protected Vehicle(int fixTime) {
        this.fixTime = fixTime;
    }

    abstract void moveForward();
}
