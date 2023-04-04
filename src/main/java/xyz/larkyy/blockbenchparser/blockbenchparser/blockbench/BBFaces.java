package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

public class BBFaces {
    private final BBFace north;
    private final BBFace east;
    private final BBFace south;
    private final BBFace west;
    private final BBFace up;
    private final BBFace down;

    public BBFaces(BBFace north, BBFace east, BBFace south, BBFace west, BBFace up, BBFace down) {
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
        this.up = up;
        this.down = down;
    }

    public BBFace getWest() {
        return west;
    }

    public BBFace getSouth() {
        return south;
    }

    public BBFace getNorth() {
        return north;
    }

    public BBFace getUp() {
        return up;
    }

    public BBFace getEast() {
        return east;
    }

    public BBFace getDown() {
        return down;
    }
}
