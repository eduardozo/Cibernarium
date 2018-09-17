package com.florist.domain;

public class Flower extends Product {

    private String color;
    private double price;

    public Flower(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void settPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }
}
