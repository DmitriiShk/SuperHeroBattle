package com.superherobattle.logic;

import com.superherobattle.characters.Character;
import com.superherobattle.util.LoggerUtil;

public class Battle {

    public static void fight(Character a, Character b) {
        LoggerUtil.log("⚔️  Battle starts between " + a.getName() + " and " + b.getName());

        int forceA = a.countForce();
        int forceB = b.countForce();

        int protectionA = a.countProtection();
        int protectionB = b.countProtection();

        LoggerUtil.log(a.getName() + " force: " + forceA + ", protection: " + protectionA);
        LoggerUtil.log(b.getName() + " force: " + forceB + ", protection: " + protectionB);

        if (forceA == forceB) {
            LoggerUtil.log("It's a draw! No damage dealt.");
            return;
        }

        if (forceA > forceB) {
            int damage = calculateDamage(forceA, protectionB);
            b.reduceHealth(damage);
            LoggerUtil.log(a.getName() + " wins! " + b.getName() + " loses " + damage + " HP.");
        } else {
            int damage = calculateDamage(forceB, protectionA);
            a.reduceHealth(damage);
            LoggerUtil.log(b.getName() + " wins! " + a.getName() + " loses " + damage + " HP.");
        }

        LoggerUtil.log("💥 Final health: " + a.getName() + " = " + a.getHealth() + ", " + b.getName() + " = " + b.getHealth());
    }

    /**
     * Вычисляет урон как разницу между силой атаки и защитой,
     * минимальный урон — 1.
     */
    private static int calculateDamage(int attackerForce, int defenderProtection) {
        int rawDamage = attackerForce - defenderProtection;
        if (rawDamage <= 0) {
            return 1; // Минимальный урон всегда 1
        }
        return rawDamage;
    }
}


