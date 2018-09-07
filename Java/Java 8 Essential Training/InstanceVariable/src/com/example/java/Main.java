package com.example.java;

import com.example.java.model.Olive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        Olive olive1 = new Olive();
        Olive olive2 = new Olive();
        Olive olive3 = new Olive();

        olives.add(olive1);
        olives.add(olive2);
        olives.add(olive3);

        OlivePress press = new OlivePress();
        press.getOil(olives);
    }
}
