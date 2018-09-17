package com.florist.domain;

public class Tree extends Product {

    private int height;
    private double price;

    public Tree(int height, double price) {
        this.height = height;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public int getHeight() {
        return height;
    }
}
