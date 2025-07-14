package com.superherobattle.util;

import com.superherobattle.characters.EvilCreature;
import com.superherobattle.characters.Superhero;
import com.superherobattle.enums.HeroType;
import com.superherobattle.enums.VillainType;
import com.superherobattle.logic.Battle;
import com.superherobattle.logic.CharacterFactory;

import java.util.Random;

public class BattleUtils {

    private static final Random random = new Random();

    public static Superhero getRandomSuperhero() {
        HeroType[] heroes = HeroType.values();
        HeroType randomHeroType = heroes[random.nextInt(heroes.length)];
        return CharacterFactory.createSuperhero(randomHeroType);
    }

    public static EvilCreature getRandomEvilCreature() {
        VillainType[] villains = VillainType.values();
        VillainType randomVillainType = villains[random.nextInt(villains.length)];
        return CharacterFactory.createEvilCreature(randomVillainType);
    }

    public static void startRandomBattle() {
        Superhero hero = getRandomSuperhero();
        EvilCreature villain = getRandomEvilCreature();
        Battle.fight(hero, villain);
    }
}


