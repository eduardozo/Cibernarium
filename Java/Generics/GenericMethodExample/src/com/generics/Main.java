package com.generics;

public class Main {

    public static void main(String[] args) {

        Integer[] ints = {20, 30, 40, 50, 60, 70, 80};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        print(ints);
        print(days);


    }



    public static <E> void print(E[] list) {
        for (E element : list) {
            System.out.print(element + "|");
        }
        System.out.println();
    }
}
