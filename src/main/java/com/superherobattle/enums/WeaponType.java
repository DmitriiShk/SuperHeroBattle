package com.superherobattle.enums;

public enum WeaponType {
    REPULSOR_BLAST("Repulsor Blast", 5),
    MJOLNIR("Mjolnir", 8),
    WEB_SHOOTER("Web Shooter", 3),
    SHIELD("Shield", 4),
    ENERGY_BLAST("Energy Blast", 6),
    BLASTERS("Blasters", 4),
    BOOMERANG("Boomerang", 3),
    POWER_RING("Power Ring", 9),
    CLAW("Claw", 5),
    BLASTER("Blaster", 6);

    private final String name;
    private final int force;

    WeaponType(String name, int force) {
        this.name = name;
        this.force = force;
    }

    public String getName() {
        return name;
    }

    public int getForce() {
        return force;
    }
}




