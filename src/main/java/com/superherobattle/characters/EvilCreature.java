package com.superherobattle.characters;

import com.superherobattle.enums.VillainType;
import com.superherobattle.items.Protection;
import com.superherobattle.items.Weapon;

public class EvilCreature extends Character {
    private VillainType type;
    private Weapon weapon;
    private Protection protection;

    public EvilCreature(VillainType type) {
        super(type.getDisplayName());
        this.type = type;
    }

    public VillainType getType() {
        return type;
    }

    public void setType(VillainType type) {
        this.type = type;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Protection getProtection() {
        return protection;
    }

    public void setProtection(Protection protection) {
        this.protection = protection;
    }

    @Override
    public int countForce() {
        int baseForce = type.getBaseForce();
        int weaponForce = (weapon != null) ? weapon.getForce() : 0;
        return baseForce + weaponForce;
    }

    @Override
    public int countProtection() {
        int baseDefense = type.getBaseDefense();
        int protectionLevel = (protection != null) ? protection.getLevel() : 0;
        return baseDefense + protectionLevel;
    }
}
