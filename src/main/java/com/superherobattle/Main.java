package com.superherobattle;

import com.superherobattle.characters.EvilCreature;
import com.superherobattle.characters.Superhero;
import com.superherobattle.enums.HeroType;
import com.superherobattle.enums.VillainType;
import com.superherobattle.items.Protection;
import com.superherobattle.items.Weapon;
import com.superherobattle.logic.Battle;

public class Main {
    public static void main(String[] args) {
        // Супергерои
        Superhero ironMan = new Superhero(
                HeroType.IRON_MAN,
                new Weapon(
                        HeroType.IRON_MAN.getWeaponType().getName(),
                        HeroType.IRON_MAN.getWeaponType().getForce(),
                        HeroType.IRON_MAN.getWeaponType()
                ),
                new Protection(
                        HeroType.IRON_MAN.getProtectionType().getName(),
                        HeroType.IRON_MAN.getProtectionType().getLevel(),
                        HeroType.IRON_MAN.getProtectionType()
                )
        );

        Superhero spiderMan = new Superhero(
                HeroType.SPIDER_MAN,
                new Weapon(
                        HeroType.SPIDER_MAN.getWeaponType().getName(),
                        HeroType.SPIDER_MAN.getWeaponType().getForce(),
                        HeroType.SPIDER_MAN.getWeaponType()
                ),
                new Protection(
                        HeroType.SPIDER_MAN.getProtectionType().getName(),
                        HeroType.SPIDER_MAN.getProtectionType().getLevel(),
                        HeroType.SPIDER_MAN.getProtectionType()
                )
        );

        // Злодеи
        EvilCreature thanos = new EvilCreature(VillainType.THANOS);
        EvilCreature loki = new EvilCreature(VillainType.LOKI);

        // Представление
        System.out.println("--- Супергерои ---");
        ironMan.introduce();
        ironMan.characterInfo();

        spiderMan.introduce();
        spiderMan.characterInfo();

        System.out.println("\n--- Злодеи ---");
        thanos.introduce();
        thanos.characterInfo();

        loki.introduce();
        loki.characterInfo();

        // Сражение
        System.out.println("\n--- СРАЖЕНИЕ ---");
        Battle.fight(ironMan, thanos);
        Battle.fight(spiderMan, loki);
    }
}

