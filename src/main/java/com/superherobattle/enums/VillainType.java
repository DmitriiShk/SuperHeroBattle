package com.superherobattle.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VillainType {
    THANOS(10, 6),
    LOKI(7, 5),
    ULTRON(8, 4),
    RED_SKULL(6, 5),
    VENOM(7, 4);

    private final int baseForce;
    private final int baseDefense;

}
