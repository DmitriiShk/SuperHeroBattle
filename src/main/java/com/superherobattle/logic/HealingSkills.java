package com.superherobattle.logic;

import com.superherobattle.characters.Character;

public interface HealingSkills {
    void heal(Character character);

    void heal(Character[] characters);
}
