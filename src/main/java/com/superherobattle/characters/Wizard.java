package com.superherobattle.characters;

import com.superherobattle.logic.HealingSkills;
import com.superherobattle.logic.ReinforcementSkills;

public class Wizard extends Character implements HealingSkills, ReinforcementSkills {

    private int force;
    private int protection;
    private int level;

    public Wizard(String name, int force, int protection, int level) {
        super(name);
        this.force = force;
        this.protection = protection;
        this.level = level;
    }

    @Override
    public int countForce() {
        return force;
    }

    @Override
    public int countProtection() {
        return protection;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    @Override
    public void heal(Character character) {
        int healAmount = 20 * level;
        character.healBy(healAmount);
        System.out.println("🧙 " + getName() + " heals " + character.getName() + " by " + healAmount + " HP.");
    }

    @Override
    public void heal(Character[] characters) {
        for (Character c : characters) {
            heal(c);
        }
    }

    @Override
    public void increaseForce(Superhero hero) {
        int currentForce = hero.countForce();
        int bonus = (int) Math.ceil(currentForce * 0.1 * level);
        hero.setForce(currentForce + bonus);
        System.out.println("💪 " + getName() + " increases " + hero.getName() + "'s force by " + bonus + ".");
    }

    @Override
    public void increaseForce(Superhero[] heroes) {
        for (Superhero hero : heroes) {
            increaseForce(hero);
        }
    }
}
