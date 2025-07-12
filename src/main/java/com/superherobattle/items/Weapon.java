package com.superherobattle.items;

import com.superherobattle.enums.WeaponType;

public class Weapon {
    private final String name;
    private final int force;
    private final WeaponType type;

    public Weapon(String name, int force, WeaponType type) {
        this.name = name;
        this.force = force;
        this.type = type;
    }

    public Weapon(String name, int force) {
        this(name, force, null);
    }

    public String getName() {
        return name;
    }

    public int getForce() {
        return force;
    }

    public WeaponType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Weapon{name='" + name + "', force=" + force + ", type=" + type + '}';
    }
}


