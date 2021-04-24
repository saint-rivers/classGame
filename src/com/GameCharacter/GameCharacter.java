package com.GameCharacter;




public class GameCharacter {

    protected String name;
    protected int health;
    protected int mana;

    protected int damage;

    public GameCharacter(String name, int health, int mana) {
        this.name = name;
        this.health = health;
        this.mana = mana;
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", health=" + health +
                ", mana=" + mana ;
    }
}
