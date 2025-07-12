package com.superherobattle.enums;

public enum VillainType {
    THANOS("Thanos", WeaponType.POWER_RING, ProtectionType.ARMOR, 10, 9),
    LOKI("Loki", WeaponType.BOOMERANG, ProtectionType.FORCE_FIELD, 7, 6),
    ULTRON("Ultron", WeaponType.BLASTER, ProtectionType.ARMOR, 8, 7),
    RED_SKULL("Red Skull", WeaponType.BLASTERS, ProtectionType.SUIT, 6, 5),
    VENOM("Venom", WeaponType.CLAW, ProtectionType.SUIT, 7, 6);

    private final String displayName;
    private final WeaponType weaponType;
    private final ProtectionType protectionType;
    private final int baseForce;
    private final int baseDefense;

    VillainType(String displayName, WeaponType weaponType, ProtectionType protectionType, int baseForce, int baseDefense) {
        this.displayName = displayName;
        this.weaponType = weaponType;
        this.protectionType = protectionType;
        this.baseForce = baseForce;
        this.baseDefense = baseDefense;
    }

    public String getDisplayName() {
        return displayName;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public ProtectionType getProtectionType() {
        return protectionType;
    }

    public int getBaseForce() {
        return baseForce;
    }

    public int getBaseDefense() {
        return baseDefense;
    }
}




