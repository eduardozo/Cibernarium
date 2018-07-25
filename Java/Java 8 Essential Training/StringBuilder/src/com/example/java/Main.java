package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2 + "!";
        System.out.println(str3);

        StringBuilder sb = new StringBuilder("Hello")
                .append(", ")
                .append("world")
                .append("!");
        System.out.println(sb);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        String input = scanner.nextLine();
        System.out.println(input);
    }

}
