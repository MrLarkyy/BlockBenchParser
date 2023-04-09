package xyz.larkyy.blockbenchparser.blockbenchparser.blockbench;

import xyz.larkyy.blockbenchparser.blockbenchparser.blockbench.BBChildren;

import java.util.UUID;

public class BBElementChildren implements BBChildren {

    private final UUID uuid;

    public BBElementChildren(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }
}
