package com.superherobattle.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProtectionType {
    // Marvel
    POWER_ARMOR(7),           // Железный человек
    ASGARDIAN_ARMOR(8),       // Тор
    NANOTECH_SUIT(6),         // Человек-паук (условно)
    VIBRANIUM_SHIELD(9),      // Капитан Америка
    GAMMA_ENERGY_FIELD(7),    // Халк (условно)

    // DC
    AMAZONIAN_ARMOR(8),       // Чудо-женщина
    POWER_SUIT(7),            // Бэтмен (например, броня)
    GREEN_LANTERN_SUIT(9),    // Зеленый Фонарь
    KRYPTONIAN_RESISTANCE(10),// Супермен (врожденная защита)
    MAGIC_BARRIER(8);         // Доктор Фэйт (магическая защита)

    private final int level;
}

