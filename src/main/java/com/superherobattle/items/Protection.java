package com.superherobattle.items;

import com.superherobattle.enums.ProtectionType;

public class Protection {
    private final String name;
    private final int level;
    private final ProtectionType type;

    public Protection(String name, int level, ProtectionType type) {
        this.name = name;
        this.level = level;
        this.type = type;
    }

    public Protection(String name, int level) {
        this(name, level, null);
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public ProtectionType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Protection{name='" + name + "', level=" + level + ", type=" + type + '}';
    }
}

