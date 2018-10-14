package com.recursion;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers should I print? ");
        int number = in.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        in.close();
    }

    private static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
