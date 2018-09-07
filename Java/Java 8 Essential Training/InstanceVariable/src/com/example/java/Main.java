package com.example.java;

import com.example.java.model.Olive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        Olive olive1 = new Olive();
        Olive olive2 = new Olive();
        olive2.setOil(1);
        Olive olive3 = new Olive();
        olive3.setOil(4);

        olives.add(olive1);
        olives.add(olive2);
        olives.add(olive3);

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("Total Olive Oil: " + totalOil);
    }
}
