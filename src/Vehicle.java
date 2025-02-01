import java.util.concurrent.TimeUnit;

public abstract class Vehicle implements Repairable{
    private final int fixTime;
    private Repairable repairable;

    protected Vehicle(int fixTime, Repairable repairable) {
        this.fixTime = fixTime;
        this.repairable = repairable;
    }

    abstract void moveForward();

    public int getFixTime() {
        return fixTime;
    }

    @Override
    public void repair(){
        try{
            TimeUnit.SECONDS.sleep(fixTime);
            repairable.repair();
        } catch (InterruptedException e) {
            System.err.println("Repair interrupted for " + e);
        }
    }
}
