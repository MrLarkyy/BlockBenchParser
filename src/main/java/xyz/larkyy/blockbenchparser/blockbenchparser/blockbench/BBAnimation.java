package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

import java.util.Map;
import java.util.UUID;

public class BBAnimation {

    private final UUID uuid;
    private final String name;
    private final String loop;
    private final Boolean override;
    private final Double length;
    private final Integer snapping;
    private final Boolean selected;
    private final String anim_time_update;
    private final String blend_weight;
    private final String start_delay;
    private final String loop_delay;
    private final Map<UUID,BBAnimator> animators;

    public BBAnimation(UUID uuid, String name, String loop, boolean override, double length,
                       int snapping, boolean selected, String anim_time_update, String blend_weight,
                       String start_delay, String loop_delay, Map<UUID,BBAnimator> animators) {
        this.uuid = uuid;
        this.name = name;
        this.loop = loop;
        this.override = override;
        this.length = length;
        this.snapping = snapping;
        this.selected = selected;
        this.anim_time_update = anim_time_update;
        this.blend_weight = blend_weight;
        this.start_delay = start_delay;
        this.loop_delay = loop_delay;
        this.animators = animators;
    }

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public double getLength() {
        return length;
    }

    public boolean isOverride() {
        return override;
    }

    public boolean isSelected() {
        return selected;
    }

    public Map<UUID, BBAnimator> getAnimators() {
        return animators;
    }

    public int getSnapping() {
        return snapping;
    }

    public String getAnim_time_update() {
        return anim_time_update;
    }

    public String getBlend_weight() {
        return blend_weight;
    }

    public String getLoop() {
        return loop;
    }

    public String getLoop_delay() {
        return loop_delay;
    }

    public String getStart_delay() {
        return start_delay;
    }
}
