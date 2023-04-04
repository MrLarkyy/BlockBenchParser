package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

public class BBMeta {

    private final String version;
    private final String model_format;
    private final boolean box_uv;

    public BBMeta(String version, String model_format, boolean box_uv) {
        this.version = version;
        this.model_format = model_format;
        this.box_uv = box_uv;
    }

    public String getModel_format() {
        return model_format;
    }

    public String getVersion() {
        return version;
    }

    public boolean isBox_uv() {
        return box_uv;
    }
}
