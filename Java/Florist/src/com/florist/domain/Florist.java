package com.florist.domain;

import java.util.ArrayList;
import java.util.List;

public class Florist {

    private String name;
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
        List<Tree> trees = new ArrayList<>();
        for (Product p : products) {
            if (p instanceof Tree) {
                trees.add((Tree) p);
            }
        }
        return trees;
    }

    public List<Flower> getFlowers() {
        List<Flower> flowers = new ArrayList<>();
        for (Product p : products) {
            if (p instanceof Flower) {
                flowers.add((Flower) p);
            }
        }
        return flowers;
    }

    public List<Decoration> getDecorations() {
        List<Decoration> decorations = new ArrayList<>();
        for (Product p : products) {
            if (p instanceof Decoration) {
                decorations.add((Decoration) p);
            }
        }
        return decorations;
    }

    public String getName() {
        return name;
    }
}
