package com.example.java.utilities;

public class MathHelper {

    public static double divValues(double d1, double d2) {
        double result = 0;
        try {
            if (d2 != 0) {
                result = d1 / d2;
            } else {
                throw (new Exception("Second value most be distinct than 0."));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    public static double multiValues(double d1, double d2) {
        return d1 * d2;
    }

    public static double subValues(double d1, double d2) {
        return d1 - d2;
    }

    public static double addValues(double d1, double d2) {
        return d1 + d2;
    }
}
