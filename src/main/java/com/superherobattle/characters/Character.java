package com.superherobattle.characters;

public abstract class Character {
    private final String name;
    private int health = 100;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void introduce() {
        System.out.println("Hi, I am a " + this.getClass().getSimpleName() + ". My name is " + name + ".");
    }

    public void characterInfo() {
        System.out.println("🧾 Character Info:");
        System.out.println("Type: " + this.getClass().getSimpleName());
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Force: " + countForce());
        System.out.println("Protection: " + countProtection());
    }

    public abstract int countForce();

    public abstract int countProtection();

    public void fight(Character another) {
        int myForce = this.countForce();
        int otherForce = another.countForce();

        System.out.println("\n--- СРАЖЕНИЕ ---");
        System.out.println("⚔️  Battle starts between " + this.name + " and " + another.name);
        System.out.println(this.name + " force: " + myForce + ", protection: " + this.countProtection());
        System.out.println(another.name + " force: " + otherForce + ", protection: " + another.countProtection());

        if (myForce == otherForce) {
            System.out.println("🤝 It's a draw! No one takes damage.");
            return;
        }

        Character winner = myForce > otherForce ? this : another;
        Character loser = myForce > otherForce ? another : this;

        int forceDiff = Math.abs(myForce - otherForce);
        int protection = loser.countProtection();

        System.out.println("[DEBUG] forceDiff = " + forceDiff);
        System.out.println("[DEBUG] loser protection = " + protection);

        int damage = protection == 0
                ? forceDiff
                : (int) Math.ceil((double) forceDiff / protection);

        damage = Math.max(damage, 1);

        System.out.println("🏆 " + winner.name + " wins! " + loser.name + " loses " + damage + " HP.");
        loser.reduceHealth(damage);

        System.out.println("💥 Final health: " + this.name + " = " + this.health + ", " + another.name + " = " + another.health);
    }

    public void reduceHealth(int amount) {
        this.health = Math.max(this.health - amount, 0);
    }

    public boolean isAlive() {
        return health > 0;
    }
}




