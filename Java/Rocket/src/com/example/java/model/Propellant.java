package com.example.java.model;

public class Propellant {

    private int power;
    private int currentPower = 0;

    public Propellant(int power) {
        this.power = power;
    }

    public void speedUp() {
        if (currentPower < power) {
            this.currentPower += 10;
        }
    }

    public void slowDown() {
        if (currentPower > 0) {
            this.currentPower -= 10;
        }
    }

    public int getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(int currentPower) {
        this.currentPower = currentPower;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
