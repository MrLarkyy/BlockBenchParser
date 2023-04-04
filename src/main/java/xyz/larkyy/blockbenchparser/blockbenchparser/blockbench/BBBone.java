package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BBBone implements BBChildren {

    private final String name;
    private final double[] origin;
    private final int color;
    private final String boneType;
    private final UUID uuid;
    private final boolean export;
    private final boolean mirror_uv;
    private final boolean isOpen;
    private final boolean locked;
    private final boolean visibility;
    private final int autoUv;
    private List<BBChildren> childrenList = new ArrayList<>();

    public BBBone(String name, double[] origin, int color, String boneType,
                  UUID uuid, boolean export, boolean mirror_uv, boolean isOpen,
                  boolean locked, boolean visibility, int autoUv, List<BBChildren> childrenList) {
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
        this.childrenList = childrenList;
    }

    public BBBone(String name, double[] origin, int color, String boneType,
                  UUID uuid, boolean export, boolean mirror_uv, boolean isOpen,
                  boolean locked, boolean visibility, int autoUv) {
        this(name,origin,color,boneType,uuid,export,mirror_uv,isOpen,locked,visibility,autoUv,new ArrayList<>());
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

    public double[] getOrigin() {
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

    public List<BBChildren> getChildrenList() {
        return childrenList;
    }
}
