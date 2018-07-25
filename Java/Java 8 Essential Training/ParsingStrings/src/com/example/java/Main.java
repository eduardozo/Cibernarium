package com.example.java;

public class Main {

    public static void main(String[] args) {

        String s1 = "Welcome to California!";
        System.out.println("Length of string: " + s1.length());

        int position = s1.indexOf("California");
        System.out.println("Position of sudstring: " + position);

        String sub = s1.substring(11);
        System.out.println(sub);

        String s2 = "Welcome!               ";
        System.out.println(s2.length());
        String s3 = s2.trim();
        System.out.println(s3.length());
    }

}
