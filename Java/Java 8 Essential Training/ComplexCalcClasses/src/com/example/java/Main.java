package com.example.java;

import com.example.java.utilities.MathHelper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String s1 = getInput("1. Enter a numeric value: ");
        String s2 = getInput("2. Enter a numeric value: ");
        String opt = getInput("Choose an operation (+ - * /): ");

        double d1 = parseNum(s1);
        double d2 = parseNum(s2);

        //if ()
        switch (opt) {
            case "+":
                System.out.println("Result: " + MathHelper.addValues(d1, d2));
                break;
            case "-":
                System.out.println("Result: " + MathHelper.subValues(d1, d2));
                break;
            case "*":
                System.out.println("Result: " + MathHelper.multiValues(d1, d2));
                break;
            case "/":
                System.out.println("Result: " + MathHelper.divValues(d1, d2));
                break;

            default:
                System.out.println("Unrecognized operation...");
        }
    }

    private static double parseNum(String s1) {
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

    private static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
