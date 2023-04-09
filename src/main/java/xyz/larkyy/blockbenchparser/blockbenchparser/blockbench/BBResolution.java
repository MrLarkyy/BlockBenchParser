package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

public class BBResolution {

    private final Integer width;
    private final Integer height;

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
