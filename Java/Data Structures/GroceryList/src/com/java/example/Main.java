package com.java.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Bread");
        groceryList.add("Meat");
        groceryList.add("Pasta");
        groceryList.add("Rice");

        System.out.println(groceryList);

        ArrayList<String> extraList = new ArrayList<>();
        extraList.add("Oil");
        extraList.add("Cereal");
        extraList.add("Cheese");
        extraList.add("Eggs");

        groceryList.addAll(extraList);

        System.out.println(groceryList);

        groceryList.removeIf(s -> s.equals("Oil"));

        /*if (groceryList.contains("Oil")) {
            groceryList.remove("Oil");
        }*/

        /*Iterator<String> iterator = groceryList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Oil")) {
                iterator.remove();
            }
        }*/
        System.out.println(groceryList);

    }
}
