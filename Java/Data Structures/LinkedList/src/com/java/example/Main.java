package com.java.example;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<>();
        states.add("Alaska");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("Pennsylvania");
        states.add("Colorado");
        states.add("Connecticut");
        states.add("Idaho");
        states.add("Florida");

        states.addFirst("Montana");
        System.out.println(states);

    }
}
