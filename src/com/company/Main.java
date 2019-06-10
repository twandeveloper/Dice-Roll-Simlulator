package com.company;

import java.util.Scanner;


public class Main {

    private static Scanner s = new Scanner(System.in);
    private static Dice dice = new Dice(1, 6);

    public static void main(String[] args) {




        boolean quit = false;
        int choice = 0;
        showMenu();

        while (!quit){
            System.out.println("Choose and option 3 to show choices");
            choice = s.nextInt();
            s.nextLine();

            switch (choice){

                case 0:
                    System.out.println("quiting dice rolling simulator");
                    quit = true;
                    break;

                case 1:
                    System.out.println("Current max value of dice " + dice.getMax());
                    System.out.println("What will be the max value of the dice");
                    int maxDiceValue = s.nextInt();
                    s.nextLine();
                    System.out.println("value set to " + maxDiceValue);
                    setMax(maxDiceValue);
                    break;

                case 2:
                    System.out.println("Rolling dice");
                    rollDice();
                    break;

                case 3:
                    showMenu();
                    break;
            }
        }

    }

    private static void setMax(int max){
        dice.setMax(max);
    }

    private static void rollDice(){
        double result = dice.rollDice();
        System.out.println("You rolled a " + result);
    }


    private static void showMenu(){
        System.out.println("0. quit Dice Rolling simulator");
        System.out.println("1. set max value on dice");
        System.out.println("2. Roll Dice");
        System.out.println("3. Show Options");
    }
}
