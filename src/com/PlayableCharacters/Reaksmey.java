package com.PlayableCharacters;

import com.GameCharacter.Player;

public class Reaksmey extends Player {

    public Reaksmey() {
        super("Reaksmey", 120, 70, 1000);
        super.setDamage(30);
        super.setSkillDamange(70);
    }

    @Override
    public void mainSkill() {
        System.out.println("Fire breath");
        bonus();
    }

    @Override
    public void bonus() {
        super.setGold(super.getGold() + 1000);
        System.out.println(super.getGold());
    }

}
