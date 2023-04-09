package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

public class BBModel {
    private final BBMeta meta;
    private final String name;
    private final String model_identifier;
    private final Integer[] visible_box;
    private final String variable_placeholders;
    private final BBResolution resolution;
    private final BBElement[] elements;
    private final BBBone[] outliner;
    private final BBTexture[] textures;
    private final BBAnimation[] animations;

    public BBModel(BBMeta meta, String name, String model_identifier, Integer[] visible_box, String variable_placeholders,
                   BBResolution resolution, BBElement[] elements, BBBone[] bones, BBTexture[] textures, BBAnimation[] animations) {
        this.meta = meta;
        this.name = name;
        this.model_identifier = model_identifier;
        this.visible_box = visible_box;
        this.variable_placeholders = variable_placeholders;
        this.resolution = resolution;
        this.elements = elements;
        this.outliner = bones;
        this.textures = textures;
        this.animations = animations;
    }

    public String getName() {
        return name;
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

    public Integer[] getVisible_box() {
        return visible_box;
    }

    public BBElement[] getElements() {
        return elements;
    }

    public BBBone[] getOutliner() {
        return outliner;
    }

    public String getModel_identifier() {
        return model_identifier;
    }

    public String getVariable_placeholders() {
        return variable_placeholders;
    }
}
