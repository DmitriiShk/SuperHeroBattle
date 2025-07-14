package com.superherobattle.logic;

import com.superherobattle.characters.Superhero;

public interface ReinforcementSkills {
    void increaseForce(Superhero hero);

    void increaseForce(Superhero[] heroes);
}
