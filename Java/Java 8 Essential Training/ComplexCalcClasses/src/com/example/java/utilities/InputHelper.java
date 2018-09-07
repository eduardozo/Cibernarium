package com.example.java.utilities;

import java.util.Scanner;

public class InputHelper {

    public String getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public double parseNum(String s1) {
        double d = 0;
        try {
            d = Double.parseDouble(s1);
        } catch (NumberFormatException e) {
            System.err.println("Number formating exception for input: " + s1);
            //throw e;
            System.exit(0);
        }
        return d;
    }

}
