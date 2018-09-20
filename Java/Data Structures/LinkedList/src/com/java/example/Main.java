package com.java.example;

import java.util.LinkedList;
import java.util.ListIterator;

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
        System.out.println("Last state in my list is: " + states.getLast());

        ListIterator iterator = states.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------------------------");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

    }
}
