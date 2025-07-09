package com.superherobattle.characters;

import com.superherobattle.enums.HeroType;
import com.superherobattle.items.Protection;
import com.superherobattle.items.Weapon;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Superhero extends Character {
    private HeroType type;
    private Weapon weapon;
    private Protection protection;

    public Superhero(HeroType type, Weapon weapon, Protection protection) {
        super(type.name());
        this.type = type;
        this.weapon = weapon;
        this.protection = protection;
    }

    @Override
    public int countForce() {
        return type.getBaseForce() + weapon.getForce();
    }

    @Override
    public int countProtection() {
        return type.getBaseDefense() + protection.getLevel();
    }
}

