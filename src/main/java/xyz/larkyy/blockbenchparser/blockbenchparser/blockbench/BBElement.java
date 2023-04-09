package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

import java.util.UUID;

public class BBElement {
    private final String name;
    private final Boolean box_uv;
    private final Boolean rescale;
    private final Boolean locked;
    private final Double[] from;
    private final Double[] to;
    private final Integer autouv;
    private final Integer color;
    private final Double inflate;
    private final Double[] rotation;
    private final Double[] origin;
    private final Integer[] uv_offset;
    private final BBFaces faces;
    private final String type;
    private final UUID uuid;

    public BBElement(String name, boolean box_uv, boolean rescale,boolean locked, Double[] from,
                     Double[] to, int autouv, int color, double inflate, Double[] rotation,
                     Double[] origin, Integer[] uv_offset, BBFaces faces, String type, UUID uuid) {
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

    public Double[] getOrigin() {
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

    public Double[] getRotation() {
        return rotation;
    }

    public Double[] getTo() {
        return to;
    }

    public Double[] getFrom() {
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

    public Integer[] getUv_offset() {
        return uv_offset;
    }
}
