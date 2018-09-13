package com.florist.domain;

public class Decoration extends Florist {

    private Material material;
    private double price = 20;

    public Decoration(Material material) {
        this.material = material;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
