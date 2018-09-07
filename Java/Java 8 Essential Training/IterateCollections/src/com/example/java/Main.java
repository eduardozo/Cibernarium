package com.example.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //--------[ List - ArrayList ]--------
        System.out.println("Ordered data: ");
        List<String> list = new ArrayList<>();
        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println("toString() output:");
        System.out.println(list);
        System.out.println();

        System.out.println("ArrayList Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
        System.out.println();


    }
}
