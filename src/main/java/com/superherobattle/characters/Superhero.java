package com.superherobattle.characters;

import com.superherobattle.enums.HeroType;
import com.superherobattle.items.Protection;
import com.superherobattle.items.Weapon;

public class Superhero extends Character {
    private HeroType type;
    private Weapon weapon;
    private Protection protection;

    public Superhero(HeroType type, Weapon weapon, Protection protection) {
        super(type.getDisplayName());
        this.type = type;
        this.weapon = weapon;
        this.protection = protection;
    }

    public HeroType getType() {
        return type;
    }

    public void setType(HeroType type) {
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

    public void setForce(int force) {
        int weaponForce = (weapon != null) ? weapon.getForce() : 0;
        int newBaseForce = force - weaponForce;
        if (newBaseForce < 0) newBaseForce = 0;

        type.setBaseForce(newBaseForce);
    }

    @Override
    public int countForce() {
        return type.getBaseForce() + (weapon != null ? weapon.getForce() : 0);
    }

    @Override
    public int countProtection() {
        return type.getBaseDefense() + (protection != null ? protection.getLevel() : 0);
    }


}


