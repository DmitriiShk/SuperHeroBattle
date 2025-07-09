package com.superherobattle.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HeroType {
    IRON_MAN(7, 6),
    HULK(10, 4),
    THOR(9, 5),
    CAPTAIN_AMERICA(6, 8),
    SPIDER_MAN(6, 5);

    private final int baseForce;
    private final int baseDefense;

}
