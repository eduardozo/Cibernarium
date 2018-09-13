package com.florist.domain;

import java.util.List;

public abstract class Florist {

    private String name;
    private List<Tree> trees;
    private List<Flower> flowers;
    private List<Decoration> decorations;


    public abstract double getPrice();

    public void addTree() {

    }

    public void addFlower() {

    }

    public void addDecoration() {

    }


}
