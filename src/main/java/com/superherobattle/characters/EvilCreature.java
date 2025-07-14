package com.superherobattle.characters;

import com.superherobattle.enums.VillainType;
import com.superherobattle.items.Protection;
import com.superherobattle.items.Weapon;

public class EvilCreature extends Character {
    private VillainType type;
    private Weapon weapon;
    private Protection protection;
    private boolean isAngry = false;

    public EvilCreature(VillainType type) {
        super(type.getDisplayName());
        this.type = type;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
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
        int force = baseForce + weaponForce;
        return isAngry ? force * 2 : force; //Сила удваивается если злодей сильно зол
    }

    @Override
    public int countProtection() {
        int baseDefense = type.getBaseDefense();
        int protectionLevel = (protection != null) ? protection.getLevel() : 0;
        return baseDefense + protectionLevel;
    }

    @Override
    public void reduceHealth(int amount) {
        int damage = isAngry ? amount * 2 : amount; //Урон удваивается если злодей сильно зол
        super.reduceHealth(damage);
    }

}
