package xyz.larkyy.blockbenchparser.blockbenchparser;

public class BBDatapoints {

    private final double x;
    private final double y;
    private final double z;

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
