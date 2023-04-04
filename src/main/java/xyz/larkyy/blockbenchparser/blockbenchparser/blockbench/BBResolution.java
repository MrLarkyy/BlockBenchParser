package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

public class BBResolution {

    private final int width;
    private final int height;

    public BBResolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
