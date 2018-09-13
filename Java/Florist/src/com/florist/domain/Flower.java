package com.florist.domain;

public class Flower extends Florist {

    private String color;
    private double price = 5;

    @Override
    public double getPrice() {
        return price;
    }

}
