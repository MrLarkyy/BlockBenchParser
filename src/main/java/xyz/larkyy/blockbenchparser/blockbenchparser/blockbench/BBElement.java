package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

import java.util.UUID;

public class BBElement {
    private final String name;
    private final boolean box_uv;
    private final boolean rescale;
    private final boolean locked;
    private final double[] from;
    private final double[] to;
    private final int autouv;
    private final int color;
    private final double inflate;
    private final double[] rotation;
    private final double[] origin;
    private final int[] uv_offset;
    private final BBFaces faces;
    private final String type;
    private final UUID uuid;

    public BBElement(String name, boolean box_uv, boolean rescale,boolean locked, double[] from,
                     double[] to, int autouv, int color, double inflate, double[] rotation,
                     double[] origin, int[] uv_offset, BBFaces faces, String type, UUID uuid) {
        this.name = name;
        this.box_uv = box_uv;
        this.rescale = rescale;
        this.locked = locked;
        this.from = from;
        this.to = to;
        this.autouv = autouv;
        this.color = color;
        this.inflate = inflate;
        this.rotation = rotation;
        this.origin = origin;
        this.uv_offset = uv_offset;
        this.faces = faces;
        this.type = type;
        this.uuid = uuid;
    }

    public double[] getOrigin() {
        return origin;
    }

    public boolean isLocked() {
        return locked;
    }

    public int getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public boolean isBox_uv() {
        return box_uv;
    }

    public double[] getRotation() {
        return rotation;
    }

    public double[] getTo() {
        return to;
    }

    public double[] getFrom() {
        return from;
    }

    public String getType() {
        return type;
    }

    public BBFaces getFaces() {
        return faces;
    }

    public boolean isRescale() {
        return rescale;
    }

    public double getInflate() {
        return inflate;
    }

    public int getAutouv() {
        return autouv;
    }

    public int[] getUv_offset() {
        return uv_offset;
    }
}
