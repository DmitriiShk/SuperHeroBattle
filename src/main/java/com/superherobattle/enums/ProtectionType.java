package com.superherobattle.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProtectionType {
    ARMOR("Armor", 10),
    SUIT("Suit", 3),
    FORCE_FIELD("Force Field", 7);

    private final String name;
    private final int level;
}


