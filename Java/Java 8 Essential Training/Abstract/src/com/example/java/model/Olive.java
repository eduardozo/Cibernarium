package com.example.java.model;

public abstract class Olive {

    private OliveName name;
    private OliveColor color;
    private int oil;

    Olive(OliveName name, OliveColor color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public OliveColor getColor() {
        return color;
    }

    public void setColor(OliveColor color) {
        this.color = color;
    }

    public int crush() {
        System.out.println(name + ", From " + getOrigin() + ": " + oil + " units");
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public abstract String getOrigin();

    @Override
    public String toString() {
        return name.toString();
    }
}
