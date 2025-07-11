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

        if (forceA > forceB) {
            int damage = calculateDamage(forceA, forceB, protectionB);
            b.reduceHealth(damage);
            LoggerUtil.log(a.getName() + " wins! " + b.getName() + " loses " + damage + " HP.");
        } else if (forceB > forceA) {
            int damage = calculateDamage(forceB, forceA, protectionA);
            a.reduceHealth(damage);
            LoggerUtil.log(b.getName() + " wins! " + a.getName() + " loses " + damage + " HP.");
        } else {
            LoggerUtil.log("It's a draw! No damage dealt.");
        }

        LoggerUtil.log("💥 Final health: " + a.getName() + " = " + a.getHealth() + ", " + b.getName() + " = " + b.getHealth());
    }

    private static int calculateDamage(int attackerForce, int defenderForce, int defenderProtection) {
        int rawDamage = attackerForce - defenderForce;
        return Math.max(0, defenderProtection > 0 ? rawDamage / defenderProtection : rawDamage);
    }
}

