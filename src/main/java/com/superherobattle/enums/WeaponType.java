package com.superherobattle.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WeaponType {
    // Marvel
    REPULSOR_BLAST(5),        // Железный человек
    MJOLNIR(8),               // Тор
    WEB_SHOOTER(3),           // Человек-паук
    SHIELD(4),                // Капитан Америка
    ENERGY_BLAST(6),          // Халк (условно)

    // DC
    BOOMERANG(3),             // Капитан Бумеранг
    LASSO_OF_TRUTH(7),        // Чудо-женщина
    POWER_RING(9),            // Зеленый Фонарь
    BATARANG(4),              // Бэтмен
    KRYPTONITE(10);           // Криптонит (слабость Супермена)

    private final int force;
}

