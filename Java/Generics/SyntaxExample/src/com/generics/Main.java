package com.generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*ArrayList a = new ArrayList();
        a.add(12);
        a.add("12");
        Integer b = (Integer) a.get(1);// run time error*/
        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);
        //a.add("12"); //compile error
        Integer b = a.get(0);

        Pair<Integer, String> p1 = new OrderedPair<>(1, "Apple");
        Pair<String, Integer> p2 = new OrderedPair<>("Banana", 2);

        print(p1.getKey(), p1.getValue());
        print(p2.getKey(), p2.getValue());
        print("Happy", "Birthday");

    }
    public static <K, V> void print(K key, V value){
        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
    }
}
