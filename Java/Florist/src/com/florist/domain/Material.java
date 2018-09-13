package com.florist.domain;

public enum Material {
    WOOD("Wood"), PLASTIC("Plastic");

    private String material;

    Material(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material;
    }
}
