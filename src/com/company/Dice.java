package com.company;

public class Dice {
    private int min = 1;
    private int max = 6;

    public Dice(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int rollDice(){
        int roll = (int)Math.floor(Math.random() *  max);
        if (roll < 1){
            roll = min;
        }
        return roll;
    }
}
