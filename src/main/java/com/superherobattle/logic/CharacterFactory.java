package com.superherobattle.logic;

import com.superherobattle.characters.EvilCreature;
import com.superherobattle.characters.Superhero;
import com.superherobattle.enums.HeroType;
import com.superherobattle.enums.VillainType;
import com.superherobattle.items.Protection;
import com.superherobattle.items.Weapon;
import com.superherobattle.items.factory.ProtectionFactory;
import com.superherobattle.items.factory.WeaponFactory;

public class CharacterFactory {

    public static Superhero createSuperhero(HeroType type) {
        Weapon weapon = WeaponFactory.createWeapon(type.getWeaponType());
        Protection protection = ProtectionFactory.createProtection(type.getProtectionType());
        return new Superhero(type, weapon, protection);
    }

    public static EvilCreature createEvilCreature(VillainType type) {
        Weapon weapon = WeaponFactory.createWeapon(type.getWeaponType());
        Protection protection = ProtectionFactory.createProtection(type.getProtectionType());
        EvilCreature creature = new EvilCreature(type);
        creature.setWeapon(weapon);
        creature.setProtection(protection);
        return creature;
    }
}

