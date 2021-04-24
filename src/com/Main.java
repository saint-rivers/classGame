package com;

import com.Controller.GameController;
import com.GameCharacter.Enemy;
import com.PlayableCharacters.Reaksmey;

public class Main {



    public static void main(String[] args) {

        Enemy enemy = new Enemy("Minion", 100, 50);

        GameController controller = new GameController(new Reaksmey(), enemy);
        controller.runMatch();

        // if click 1 attack
            // get enemy object
            // reduce their health

    }


}
