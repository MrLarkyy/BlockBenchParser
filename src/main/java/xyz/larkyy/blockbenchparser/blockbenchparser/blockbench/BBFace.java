package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

public class BBFace {

    private final Double[] uv;
    private final Integer texture;

    public BBFace(Double[] uv, int texture) {
        this.uv =uv;
        this.texture = texture;
    }

    public int getTexture() {
        return texture;
    }

    public Double[] getUv() {
        return uv;
    }
}
