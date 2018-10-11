package com.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> duplicates = new ArrayList<>();
        duplicates.add(1);
        duplicates.add(1);
        duplicates.add(2);
        duplicates.add(2);
        duplicates.add(3);
        duplicates.add(3);
        duplicates.add(4);
        duplicates.add(4);
        duplicates.add(5);
        duplicates.add(5);

        ArrayList<String> s = new ArrayList<>();
        s.add("Monday");
        s.add("Monday");
        s.add("Tuesday");
        s.add("Wednesday");
        s.add("Wednesday");
        s.add("Thursday");

        System.out.println(eliminateDuplicates(duplicates));
        System.out.println(eliminateDuplicates(s));


    }

    private static <E extends Comparable<E>> ArrayList<E> eliminateDuplicates(ArrayList<E> list) {
        if (list.size() == 0) {
            return list;
        }

        ArrayList<E> newArrayList = new ArrayList<>();
        Iterator<E> iterator = list.iterator();

        newArrayList.add(iterator.next());
        while (iterator.hasNext()) {
            E value = iterator.next();
            if (!newArrayList.contains(value)) {
                newArrayList.add(value);
            }
        }

        return newArrayList;
    }
}
