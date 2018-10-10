package com.generics;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    // prior to java 5.0
        Comparable c = new Date();
        System.out.println(c.compareTo("Monday"));


    }
}
