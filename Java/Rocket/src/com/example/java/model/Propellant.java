package com.example.java.model;

public class Propellant {

    private int power;
    private int currentPower = 0;

    public Propellant(int power) {
        this.power = power;
    }

    public void speedUp() {
        if (currentPower < power) {
            if ((currentPower + 10) > power) {
                this.currentPower = power;
            } else {
                this.currentPower += 10;
            }
        }
    }

    public void slowDown() {
        if (currentPower > 0) {
            if ((currentPower - 10) <= 0) {
                currentPower = 0;
            } else {
                this.currentPower -= 10;
            }
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
