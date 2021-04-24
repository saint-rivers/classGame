package com.HWMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class HWMenu {

    String header;
    ArrayList<String> options;
    String footer;
    int choice;

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    void display(){
        showHeader();
        showBody();
        showFooter();
    }

    protected void showHeader(){
        System.out.println(header);
    }

    protected void showBody(){
        options.forEach(System.out::println);
    }

    protected void showFooter(){
        System.out.println(footer);
    }

    protected void getUserInput(){
        choice = scanner.nextInt();
    }
}

class AddMenu extends HWMenu{

    @Override
    protected void showBody() {
        for (String s :options) {
            System.out.print(s);
            getUserInput();
        }
    }
}

class DeleteMenu extends HWMenu{

    @Override
    void display() {
        showHeader();
        getUserInput();
        showBody();
    }
}


