package com.florist.domain;

public class Tree extends Florist {

    private String height;
    private double price = 15;

    @Override
    public double getPrice() {
        return price;
    }

    public String getHeight() {
        return height;
    }
}
