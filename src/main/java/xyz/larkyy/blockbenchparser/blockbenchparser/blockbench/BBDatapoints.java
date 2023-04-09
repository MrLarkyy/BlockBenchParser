package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

public class BBDatapoints {

    private final Double x;
    private final Double y;
    private final Double z;

    public BBDatapoints(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
}
