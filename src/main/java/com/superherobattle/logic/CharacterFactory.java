package com.superherobattle.logic;

import com.superherobattle.characters.EvilCreature;
import com.superherobattle.characters.Superhero;
import com.superherobattle.enums.HeroType;
import com.superherobattle.enums.VillainType;
import com.superherobattle.items.Protection;
import com.superherobattle.items.Weapon;

public class CharacterFactory {

    public static Superhero createSuperhero(HeroType type) {
        Weapon weapon = new Weapon(type.getWeaponType().getName(), type.getWeaponType().getForce());
        Protection protection = new Protection(type.getProtectionType().getName(), type.getProtectionType().getLevel());
        return new Superhero(type, weapon, protection);
    }

    public static EvilCreature createEvilCreature(VillainType type) {
        Weapon weapon = new Weapon(type.getWeaponType().getName(), type.getWeaponType().getForce());
        Protection protection = new Protection(type.getProtectionType().getName(), type.getProtectionType().getLevel());
        EvilCreature creature = new EvilCreature(type);
        creature.setWeapon(weapon);         // Чтобы EvilCreature тоже имел оружие и защиту
        creature.setProtection(protection);
        return creature;
    }
}

