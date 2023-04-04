package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

import java.util.ArrayList;
import java.util.List;

public class BBModel {
    private final BBMeta meta;
    private final String name;
    private final String model_identifier;
    private final int[] visible_box;
    private final String variable_placeholders;
    private final BBResolution resolution;
    private List<BBBone> bones = new ArrayList<>();
    private final BBTexture[] textures;
    private final BBAnimation[] animations;

    public BBModel(BBMeta meta, String name, String model_identifier, int[] visible_box, String variable_placeholders,
                   BBResolution resolution, List<BBBone> bones, BBTexture[] textures, BBAnimation[] animations) {
        this.meta = meta;
        this.name = name;
        this.model_identifier = model_identifier;
        this.visible_box = visible_box;
        this.variable_placeholders = variable_placeholders;
        this.resolution = resolution;
        this.bones = bones;
        this.textures = textures;
        this.animations = animations;
    }

    public String getName() {
        return name;
    }

    public void setBones(List<BBBone> bones) {
        this.bones = bones;
    }

    public BBAnimation[] getAnimations() {
        return animations;
    }

    public BBMeta getMeta() {
        return meta;
    }

    public BBResolution getResolution() {
        return resolution;
    }

    public BBTexture[] getTextures() {
        return textures;
    }

    public int[] getVisible_box() {
        return visible_box;
    }

    public List<BBBone> getBones() {
        return bones;
    }
    
    public String getModel_identifier() {
        return model_identifier;
    }

    public String getVariable_placeholders() {
        return variable_placeholders;
    }
}
