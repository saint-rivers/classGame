package com.menu;

import com.GameCharacter.Enemy;
import com.GameCharacter.Player;

import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    private final Player player;
    private final Enemy enemy;
    public final int EXIT_CODE = 4;
    private int choice = 0;

    public Menu(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void execute() {
        displayGameMenu();
        System.out.println("\n>> What do you do? _");
        choice = scanner.nextInt();
    }

    private void displayGameMenu() {
        System.out.println(this.enemy);
        System.out.println(this.player);
        printPlayerOptions();
    }

    private void printPlayerOptions() {
        String header = "== Skill ==";
        String[] options = {
                "[1] Attack",
                "[2] Skill",
                "[3] Use Item",
                "[4] Run"
        };
        System.out.println(header);
        for (String s :
                options) {
            System.out.print(s + "\t");
        }
    }

    public int getChoice() {
        return choice;
    }
}
