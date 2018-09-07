package com.example.java;

import com.example.java.utilities.InputHelper;
import com.example.java.utilities.MathHelper;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.calculate();
    }

    protected void calculate() {
        InputHelper helper = new InputHelper();
        String s1 = helper.getInput("1. Enter a numeric value: ");
        String s2 = helper.getInput("2. Enter a numeric value: ");
        String opt = helper.getInput("Choose an operation (+ - * /): ");

        double d1 = helper.parseNum(s1);
        double d2 = helper.parseNum(s2);

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
}
