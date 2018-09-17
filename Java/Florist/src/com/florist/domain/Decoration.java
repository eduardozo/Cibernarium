package com.florist.domain;

public class Decoration extends Product {

    private Material material;
    private double price;

    public Decoration(Material material, double price) {
        this.material = material;
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

    public Material getMaterial() {
        return material;
    }
}
