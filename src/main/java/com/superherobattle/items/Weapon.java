package com.superherobattle.items;

import com.superherobattle.enums.WeaponType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Weapon {
    private final String name;
    private final int force;
    private final WeaponType type;
}

