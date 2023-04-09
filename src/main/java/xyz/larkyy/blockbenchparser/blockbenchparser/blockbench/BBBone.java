package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

import java.util.UUID;

public class BBBone implements BBChildren {

    private final String name;
    private final Double[] origin;
    private final Integer color;
    private final String boneType;
    private final UUID uuid;
    private final Boolean export;
    private final Boolean mirror_uv;
    private final Boolean isOpen;
    private final Boolean locked;
    private final Boolean visibility;
    private final Integer autoUv;
    private final BBChildren[] children;

    public BBBone(String name, Double[] origin, int color, String boneType,
                  UUID uuid, boolean export, boolean mirror_uv, boolean isOpen,
                  boolean locked, boolean visibility, int autoUv, BBChildren[] children) {
        this.name = name;
        this.origin = origin;
        this.color = color;
        this.boneType = boneType;
        this.uuid = uuid;
        this.export = export;
        this.mirror_uv = mirror_uv;
        this.isOpen = isOpen;
        this.locked = locked;
        this.visibility = visibility;
        this.autoUv = autoUv;
        this.children = children;
    }

    public BBBone(String name, Double[] origin, int color, String boneType,
                  UUID uuid, boolean export, boolean mirror_uv, boolean isOpen,
                  boolean locked, boolean visibility, int autoUv) {
        this(name,origin,color,boneType,uuid,export,mirror_uv,isOpen,locked,visibility,autoUv,new BBChildren[]{});
    }

    public UUID getUuid() {
        return uuid;
    }

    public boolean isLocked() {
        return locked;
    }

    public String getName() {
        return name;
    }

    public Double[] getOrigin() {
        return origin;
    }

    public boolean isExport() {
        return export;
    }

    public boolean isMirror_uv() {
        return mirror_uv;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public int getAutoUv() {
        return autoUv;
    }

    public int getColor() {
        return color;
    }

    public String getBoneType() {
        return boneType;
    }

    public BBChildren[] getChildren() {
        return children;
    }
}
