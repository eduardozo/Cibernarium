package com.example.java;

import com.example.java.model.Propellant;
import com.example.java.model.Rocket;
import com.example.java.utilities.InvalidParamException;

public class Main {

    public static void main(String[] args) throws InvalidParamException {

        Rocket rocket1 = new Rocket("32WESSDS");
        rocket1.addPropellant(15);
        rocket1.addPropellant(30);
        rocket1.addPropellant(42);

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
        System.out.println("\n\nVelocity r1: " + rocket1.getVelocity());
        System.out.println("Velocity r2: " + rocket2.getVelocity());

        System.out.println("\nSpeed up 3 times...\n");
        for (int i = 0; i < 3; i++) {
            rocket1.speedUp();
            rocket2.speedUp();
        }

        System.out.println("Velocity r1: " + rocket1.getVelocity());
        System.out.println("Velocity r2: " + rocket2.getVelocity());


        System.out.println("\nSlow down 5 times for r1...");
        for (int i = 0; i < 5; i++) {
            rocket1.slowDown();
        }

        System.out.println("Speed up 7 times for r2...\n");
        for (int i = 0; i < 7; i++) {
            rocket2.speedUp();
        }

        System.out.println("Velocity r1: " + rocket1.getVelocity());
        System.out.println("Velocity r2: " + rocket2.getVelocity());

        System.out.println("\nSpeed up r1 and r2 15 times...\n");
        for (int i = 0; i < 15; i++) {
            rocket1.speedUp();
            rocket2.speedUp();
        }

        System.out.println("Velocity r1: " + rocket1.getVelocity());
        System.out.println("Velocity r2: " + rocket2.getVelocity());

    }
}
