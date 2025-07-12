package com.superherobattle.enums;

public enum ProtectionType {
    ARMOR("Armor", 10),
    SUIT("Suit", 3),
    FORCE_FIELD("Force Field", 7);

    private final String name;
    private final int level;

    ProtectionType(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
}




