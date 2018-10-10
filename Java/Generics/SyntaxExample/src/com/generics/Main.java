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
    }
}
