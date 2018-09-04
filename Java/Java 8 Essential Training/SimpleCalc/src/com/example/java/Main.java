package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String num1;
        String num2;
	    Scanner scan = new Scanner(System.in);

        System.out.println("[ Simple Calc ]");
        System.out.println("Insert a number: ");
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        num1 = scan.nextLine();

        System.out.println("Insert a new number: ");
        num2 = scan.nextLine();
        System.out.println("Sum: " + (Double.parseDouble(num1) + Double.parseDouble(num2)));

    }
}
