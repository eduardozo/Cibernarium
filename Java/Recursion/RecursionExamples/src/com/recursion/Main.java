package com.recursion;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numList = {20, 30, 40, 50, 60, 70};
        reversePrint(numList);
        System.out.println();

        System.out.println("Enter a number for the factorial number: ");
        int f = in.nextInt();
        System.out.println("The factorial de " + f + " es: " + factorial(f));

        //GCD
        System.out.println("Enter two numbers and I'll find the GCD");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(greatest(x, y));

    }

    private static int greatest(int x, int y) {
        int temp = x;
        if (x < y) {
            x = y;
            y = temp;
        }

        if (y == 0) {
            return x;
        }
        return greatest(y, (x % y));
    }

    private static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    private static void reversePrint(int[] numbers) {
        if (numbers.length == 0) {
            return;
        }

        int[] a = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length - 1; i++) {
            a[i] = numbers[i + 1];
        }
        reversePrint(a);
        System.out.print(numbers[0] + "|");
    }
}
