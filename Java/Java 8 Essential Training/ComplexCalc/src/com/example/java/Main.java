package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String s1 = getInput("1. Enter a numeric value: ");
        String s2 = getInput("2. Enter a numeric value: ");
        String opt = getInput("Choose an operation (+ - * /): ");

        switch (opt) {
            case "+":
                System.out.println("Result: " + addValues(s1, s2));
                break;
            case "-":
                System.out.println("Result: " + subValues(s1, s2));
                break;
            case "*":
                System.out.println("Result: " + multiValues(s1, s2));
                break;
            case "/":
                System.out.println("Result: " + divValues(s1, s2));
                break;

                default:
                    System.out.println("Unrecognized operation...");
        }
    }

    private static double divValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = 0;
        try {
            if(d2 != 0) {
                result = d1 / d2;
            } else {
                throw (new Exception("Second value most be distinct than 0."));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    private static double multiValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;
    }

    private static double subValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;
    }

    private static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

    private static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
