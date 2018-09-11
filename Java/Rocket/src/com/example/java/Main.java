package com.example.java;

import com.example.java.model.Propellant;
import com.example.java.model.Rocket;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Rocket rocket1 = new Rocket("32WESSDS");
        List<Propellant> propellantsR1 = new ArrayList<>();
        propellantsR1.add(new Propellant());
        propellantsR1.add(new Propellant());
        propellantsR1.add(new Propellant());
        rocket1.setPropellants(propellantsR1);

        System.out.println("Rocket 1 with code: " + rocket1.getCode() + " has " + rocket1.getPropellants().size() + " propellers.");

        Rocket rocket2 = new Rocket("LDSFJA32");
        List<Propellant> propellantsR2 = new ArrayList<>();
        propellantsR2.add(new Propellant());
        propellantsR2.add(new Propellant());
        propellantsR2.add(new Propellant());
        propellantsR2.add(new Propellant());
        propellantsR2.add(new Propellant());
        propellantsR2.add(new Propellant());
        rocket2.setPropellants(propellantsR2);

        System.out.println("Rocket 2 with code: " + rocket2.getCode() + " has " + rocket2.getPropellants().size() + " propellers.");

    }
}
