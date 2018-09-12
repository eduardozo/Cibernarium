package com.example.java;

import com.example.java.model.Propellant;
import com.example.java.model.Rocket;
import com.example.java.utilities.InvalidParamException;

public class Main {

    public static void main(String[] args) throws InvalidParamException {

        Rocket rocket1 = new Rocket("32WESSDS");
        rocket1.addPropellant(10);
        rocket1.addPropellant(30);
        rocket1.addPropellant(40);

        System.out.println("Rocket 1 with code: " + rocket1.getCode() + " has " + rocket1.getPropellants().size() + " propellants.");

        Rocket rocket2 = new Rocket("LDSFJA32");
        rocket2.addPropellant(30);
        rocket2.addPropellant(40);
        rocket2.addPropellant(50);
        rocket2.addPropellant(50);
        rocket2.addPropellant(30);
        rocket2.addPropellant(10);


        System.out.println("Rocket 2 with code: " + rocket2.getCode() + " has " + rocket2.getPropellants().size() + " propellants.");
        System.out.println();

        System.out.print("Rocket: " + rocket1.getCode() + ", Power: ");
        for (Propellant p : rocket1.getPropellants()) {
            System.out.print(p.getPower() + ", ");
        }

        System.out.println();

        System.out.print("Rocket: " + rocket2.getCode() + ", Power: ");
        for (Propellant p : rocket2.getPropellants()) {
            System.out.print(p.getPower() + ", ");
        }

        System.out.println();
        System.out.println();

        System.out.print("Rocket: " + rocket1.getCode() + ", Initial Power: ");
        for (Propellant p : rocket1.getPropellants()) {
            System.out.print(p.getCurrentPower() + ", ");
        }
        rocket1.speedUp();
        rocket1.speedUp();
        rocket1.speedUp();
        rocket1.speedUp();
        rocket1.slowDown();
        rocket1.slowDown();
        rocket1.slowDown();
        rocket1.slowDown();

        System.out.println();

        System.out.print("Rocket: " + rocket1.getCode() + ", increased Power: ");
        for (Propellant p : rocket1.getPropellants()) {
            System.out.print(p.getCurrentPower() + ", ");
        }

    }
}
