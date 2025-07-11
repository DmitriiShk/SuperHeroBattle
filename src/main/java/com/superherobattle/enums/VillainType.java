package com.superherobattle.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
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
}


