package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

import xyz.larkyy.blockbenchparser.blockbenchparser.BBDatapoints;

import java.util.UUID;

public class BBKeyframe {
    private final String channel;
    private final BBDatapoints data_points;
    private final UUID uuid;
    private final double time;
    private final int color;
    private final String interpolation;

    public BBKeyframe(String channel, BBDatapoints data_points, UUID uuid, double time, int color, String interpolation) {
        this.channel = channel;
        this.data_points = data_points;
        this.uuid = uuid;
        this.time =time;
        this.color = color;
        this.interpolation = interpolation;
    }

    public int getColor() {
        return color;
    }

    public UUID getUuid() {
        return uuid;
    }

    public BBDatapoints getData_points() {
        return data_points;
    }

    public double getTime() {
        return time;
    }

    public String getChannel() {
        return channel;
    }

    public String getInterpolation() {
        return interpolation;
    }
}
