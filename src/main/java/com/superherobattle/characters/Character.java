package com.superherobattle.characters;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class Character {
    private final String name;
    private int health = 100;

    public void introduce() {
        System.out.println("Hi, I am a " + this.getClass().getSimpleName() + ". My name is " + name + ".");
    }

    public void characterInfo() {
        System.out.println("Character Info:");
        System.out.println("Type: " + this.getClass().getSimpleName());
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Force: " + countForce());
        System.out.println("Protection: " + countProtection());
        // Дополнительно можно добавить детали оружия и защиты в наследниках
    }

    public abstract int countForce();

    public abstract int countProtection();

    public void fight(Character another) {
        int myForce = this.countForce();
        int otherForce = another.countForce();

        System.out.println(this.name + " (Force: " + myForce + ") vs " + another.name + " (Force: " + otherForce + ")");

        if (myForce == otherForce) {
            System.out.println("It's a draw! No health lost.");
            return;
        }

        Character winner = myForce > otherForce ? this : another;
        Character loser = myForce > otherForce ? another : this;

        int forceDiff = Math.abs(myForce - otherForce);
        int protection = loser.countProtection();

        int damage = protection == 0 ? forceDiff : forceDiff / protection;
        damage = Math.max(damage, 1); // минимум 1 урона

        System.out.println(winner.name + " wins! " + loser.name + " takes " + damage + " damage.");

        loser.reduceHealth(damage);

        System.out.println(loser.name + " health is now " + loser.health);
    }

    public void reduceHealth(int amount) {
        health = Math.max(health - amount, 0);
    }

    public boolean isAlive() {
        return health > 0;
    }
}


