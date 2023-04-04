package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

public class BBAnimator {
    private final String name;
    private final String type;
    private final BBKeyframe[] keyframes;

    public BBAnimator(String name, String type, BBKeyframe[] keyframes) {
        this.name = name;
        this.type = type;
        this.keyframes = keyframes;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public BBKeyframe[] getKeyframes() {
        return keyframes;
    }
}
