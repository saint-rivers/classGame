package com.GameCharacter;



abstract public class Player extends GameCharacter{

    private long gold;
    private int skillDamange;

    public Player(String name, int health, int mana, long gold) {
        super(name, health, mana);
        this.gold = gold;
    }

    public int getSkillDamange() {
        return skillDamange;
    }

    public void setSkillDamange(int skillDamange) {
        this.skillDamange = skillDamange;
    }

    public long getGold() {
        return gold;
    }

    public void setGold(long gold) {
        this.gold = gold;
    }

    @Override
    public String toString() {
        return "Player{" +
                super.toString() +
                ", gold=" + gold +
                '}';
    }

    public abstract void mainSkill();

    public abstract void bonus();
}
