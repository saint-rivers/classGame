package com.GameCharacter;

public class Enemy extends GameCharacter {

    public Enemy(String name, int health, int mana) {
        super(name, health, mana);
        super.setDamage(10);
    }

    @Override
    public String toString() {
        return "Enemy{" +
                super.toString() +
                '}';
    }
}
