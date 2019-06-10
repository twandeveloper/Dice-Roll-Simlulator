package com.company;

public class Dice {
    private double min = 1;
    private double max = 6;

    public Dice(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double rollDice(){
        double roll = Math.round(Math.random() *  max);
        if (roll < 1){
            roll = min;
        }
        return roll;
    }
}
