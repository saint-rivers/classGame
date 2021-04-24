package com.PlayableCharacters;

import com.GameCharacter.Player;

public class Chhaihuo extends Player {


    public Chhaihuo() {
        super("Chhaihuo", 110, 100, 1000);
        setDamage(50);
    }

    @Override
    public void mainSkill() {
        System.out.println("Firebreath");
    }

    @Override
    public void bonus() {
        super.setHealth(super.getHealth() + 30);
        System.out.println(super.getHealth());
    }

    void heal(){

    }
}
