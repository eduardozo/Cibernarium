package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String s1 = getInput("1. Enter a numeric value: ");
        String s2 = getInput("2. Enter a numeric value: ");
        String opt = getInput("Choose an operation (+ - * /): ");

        switch (opt) {
            case "+":
                break;
            case "-":
                break;
            case "*":
                break;
            case "/":
                break;

                default:
                    System.out.println("Unrecognized operation...");
        }
    }

    private static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
