package com.example.java;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        //imprecise calculation in java
        double value = .012;
        double psum = value + value + value;
        System.out.println("value: " + value);
        System.out.println("sum of primitive: " + psum);

        //precise calculation BigDecimal
        String strValue = Double.toString(value);
        System.out.println("\nstrValue: " + strValue);
        BigDecimal bigValue = new BigDecimal(strValue);

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);

        System.out.println("sum of BigDecimals: " + bSum);

    }

}
