package com.java.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        System.out.println("Position of 21: " + Collections.binarySearch(list, 21));

    }
}
