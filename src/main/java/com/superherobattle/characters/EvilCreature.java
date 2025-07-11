package com.superherobattle.characters;

import com.superherobattle.enums.VillainType;
import com.superherobattle.items.Protection;
import com.superherobattle.items.Weapon;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EvilCreature extends Character {
    private VillainType type;
    private Weapon weapon;
    private Protection protection;

    public EvilCreature(VillainType type) {
        super(type.name());
        this.type = type;
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


