package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

public class BBFace {

    private final double[] uv;
    private final int texture;

    public BBFace(double[] uv, int texture) {
        this.uv =uv;
        this.texture = texture;
    }

    public int getTexture() {
        return texture;
    }

    public double[] getUv() {
        return uv;
    }
}
