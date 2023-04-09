package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

import java.util.UUID;

public class BBTexture {

    private final String path;
    private final String name;
    private final String folder;
    private final String namespace;
    private final String id;
    private final Boolean particle;
    private final String render_mode;
    private final String render_sides;
    private final Integer frame_time;
    private final String frame_order_type;
    private final String frame_order;
    private final Boolean frame_interpolate;
    private final Boolean visible;
    private final String mode;
    private final Boolean saved;
    private final UUID uuid;
    private final String source;
    private final String relative_path;

    public BBTexture(String path, String name, String folder, String namespace, String id, boolean particle,
                     String render_mode, String render_sides, int frame_time, String frame_order_type,
                     String frame_order, boolean frame_interpolate, boolean visible, String mode, boolean saved,
                     UUID uuid, String source, String relative_path) {
        this.path = path;
        this.name = name;
        this.folder = folder;
        this.namespace = namespace;
        this.id = id;
        this.particle = particle;
        this.render_mode = render_mode;
        this.render_sides = render_sides;
        this.frame_time = frame_time;
        this.frame_order_type = frame_order_type;
        this.frame_order = frame_order;
        this.frame_interpolate = frame_interpolate;
        this.visible = visible;
        this.mode = mode;
        this.saved = saved;
        this.uuid = uuid;
        this.source = source;
        this.relative_path = relative_path;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public boolean isFrame_interpolate() {
        return frame_interpolate;
    }

    public boolean isParticle() {
        return particle;
    }

    public boolean isSaved() {
        return saved;
    }

    public boolean isVisible() {
        return visible;
    }

    public int getFrame_time() {
        return frame_time;
    }

    public String getFolder() {
        return folder;
    }

    public String getFrame_order() {
        return frame_order;
    }

    public String getFrame_order_type() {
        return frame_order_type;
    }

    public String getMode() {
        return mode;
    }

    public String getNamespace() {
        return namespace;
    }

    public String getPath() {
        return path;
    }

    public String getRelative_path() {
        return relative_path;
    }

    public String getRender_mode() {
        return render_mode;
    }

    public String getRender_sides() {
        return render_sides;
    }
}
