package com.florist.domain;

import java.util.ArrayList;
import java.util.List;

public class Florist {

    private String name;
    private List<Tree> trees = new ArrayList<>();
    private List<Flower> flowers = new ArrayList<>();
    private List<Decoration> decorations = new ArrayList<>();
    private List<Product> products = new ArrayList<>();

    public Florist(String name) throws Exception {
        if (name.equals("")) throw new Exception();
        this.name = name;
    }

    public void addTree(int height, double price) {
        products.add(new Tree(height, price));
    }

    public void addFlower(String color, double price) {
        products.add(new Flower(color, price));
    }

    public void addDecoration(Material material, double price) {
        products.add(new Decoration(material, price));
    }

    public List<Tree> getTrees() {
        return trees;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public List<Decoration> getDecorations() {
        return decorations;
    }

    public String getName() {
        return name;
    }
}
