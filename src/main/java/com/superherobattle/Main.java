package com.superherobattle;

import com.superherobattle.characters.EvilCreature;
import com.superherobattle.characters.Superhero;
import com.superherobattle.characters.Wizard;
import com.superherobattle.enums.HeroType;
import com.superherobattle.enums.VillainType;
import com.superherobattle.items.Protection;
import com.superherobattle.items.Weapon;
import com.superherobattle.logic.Battle;
import com.superherobattle.util.BattleUtils;

public class Main {
    public static void main(String[] args) {
        // --- Супергерои ---
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

        // --- Злодеи ---
        EvilCreature thanos = new EvilCreature(VillainType.THANOS);
        EvilCreature loki = new EvilCreature(VillainType.LOKI);

        // --- Маг (Wizard) ---
        Wizard gandalf = new Wizard("Gandalf", 4, 3, 2); // level = 2 → +20 HP, +20% силы

        System.out.println("\n--- МАГ ВСТУПАЕТ В ИГРУ ---");
        gandalf.introduce();

        // Усиление и лечение героев
        gandalf.increaseForce(ironMan);
        gandalf.increaseForce(spiderMan);
        gandalf.heal(ironMan);
        gandalf.heal(spiderMan);

        // --- Представление ---
        System.out.println("\n--- Супергерои после усиления ---");
        ironMan.characterInfo();
        spiderMan.characterInfo();

        System.out.println("\n--- Злодеи ---");
        thanos.introduce();
        thanos.characterInfo();
        loki.introduce();
        loki.characterInfo();

        // --- Сражения ---
        System.out.println("\n--- СРАЖЕНИЕ ---");
        Battle.fight(ironMan, thanos);
        Battle.fight(spiderMan, loki);

        // --- Случайная битва ---
        System.out.println("\n--- СЛУЧАЙНАЯ БИТВА ---");
        BattleUtils.startRandomBattle();
    }
}


