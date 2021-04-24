package com.Controller;

import com.GameCharacter.Enemy;
import com.GameCharacter.GameCharacter;
import com.GameCharacter.Player;
import com.PlayableCharacters.Chhaihuo;
import com.PlayableCharacters.Reaksmey;
import com.menu.Menu;

import java.util.ArrayList;

public class GameController {

    Player player;
    Enemy enemy;
    Menu menu;

    public GameController(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
        menu = new Menu(player, enemy);
    }

    public void runMatch(){

        while (menu.getChoice() != menu.EXIT_CODE){
            menu.execute();
            switch (menu.getChoice()){
                case 1:
                    doDamageOneRound();
                    break;

                case 2:
                    player.mainSkill();
                    doDamageOneRound();
                    break;

                case 3:

                    break;
            }
        }


    }

    private void doDamageOneRound() {
        doDamage(player, enemy);
        doDamage(enemy, player);
    }


    private void doDamage(GameCharacter attacker, GameCharacter opponent){
        int health = opponent.getHealth();
        opponent.setHealth(health - attacker.getDamage());

    }

    private <T extends GameCharacter> void doDamageGeneric(T character){
        int health = character.getHealth();
        character.setHealth(health - 30);
    }

    public static void main(String[] args) {

        Reaksmey smey = new Reaksmey();
        Chhaihuo chhaihuo = new Chhaihuo();

        ArrayList<Player> heroList = new ArrayList<>();
        heroList.add(smey);
        heroList.add(chhaihuo);

        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new Enemy("Minion", 100, 50));
        enemies.add(new Enemy("Minion", 100, 50));
        enemies.add(new Enemy("Minion", 100, 50));

//        // Simple loop
//        for (Player player :heroList) {
//            player.mainSkill();
//        }
//
//        // Lambda expression
//        heroList.forEach(player -> {
//            player.mainSkill();
//            player.bonus();
//        });

        // Method reference
        heroList.forEach(Player::mainSkill);

    }
}
