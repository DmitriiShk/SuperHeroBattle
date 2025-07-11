package com.superherobattle.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HeroType {
    IRON_MAN("Iron Man", WeaponType.REPULSOR_BLAST, ProtectionType.ARMOR, 8, 10),
    SPIDER_MAN("Spider-Man", WeaponType.WEB_SHOOTER, ProtectionType.SUIT, 6, 3),
    HULK("Hulk", WeaponType.ENERGY_BLAST, ProtectionType.FORCE_FIELD, 10, 7),
    THOR("Thor", WeaponType.MJOLNIR, ProtectionType.ARMOR, 9, 9),
    CAPTAIN_AMERICA("Captain America", WeaponType.SHIELD, ProtectionType.ARMOR, 7, 8),
    BLACK_WIDOW("Black Widow", WeaponType.BLASTERS, ProtectionType.SUIT, 5, 4);

    private final String displayName;
    private final WeaponType weaponType;
    private final ProtectionType protectionType;
    private final int baseForce;
    private final int baseDefense;
}


