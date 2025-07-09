package com.superherobattle.characters;

import com.superherobattle.enums.VillainType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EvilCreature extends Character {
    private VillainType type;

    public EvilCreature(VillainType type) {
        super(type.name());
        this.type = type;
    }

    @Override
    public int countForce() {
        return type.getBaseForce();
    }

    @Override
    public int countProtection() {
        return type.getBaseDefense();
    }
}

