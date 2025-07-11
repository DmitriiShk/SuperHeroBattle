package com.superherobattle.items.factory;

import com.superherobattle.enums.WeaponType;
import com.superherobattle.items.Weapon;

public class WeaponFactory {

    public static Weapon createWeapon(WeaponType type) {
        // В реальности параметры могут браться из enum,
        // или настраиваться более гибко
        return new Weapon(type.getName(), type.getForce(), type);
    }
}

