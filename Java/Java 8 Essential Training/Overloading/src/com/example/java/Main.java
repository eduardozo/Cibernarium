package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String s1 = getInput("Enter value 1: ");
        String s2 = getInput("Enter value 2: ");
        String s3 = getInput("Enter value 3: ");

        double result1 = addValues(s1, s2);
        System.out.println("1. Result for 2 values is: " + result1);

        double result2 = addValues(s1, s2, s3);
        System.out.println("2. Result for 3 values is: " + result2);

        double result3 = addValues(s1, s2, s3, s1, s2, s3);
        System.out.println("3. Result for multiple values is: " + result3);
    }

    private static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

    private static double addValues(String s1, String s2, String s3) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double d3 = Double.parseDouble(s3);
        return d1 + d2 + d3;
    }

    private static double addValues(String ... values) {
        double result = 0;
        for (String value : values) {
            double d = Double.parseDouble(value);
            result += d;
        }
        return result;
    }

    private static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
