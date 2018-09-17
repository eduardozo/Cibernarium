package com.florist.application;

import com.florist.domain.*;

public class FloristController {

    private Florist florist;

    public FloristController() {
    }


    public void createFlorist(String name) throws Exception {
        florist = new Florist(name);
    }

    public void addTree(int height, double price) {
        florist.addTree(height, price);
    }

    public void addFlower(String color, double price) {
        florist.addFlower(color, price);
    }

    public void addDecoration(Material material, double price) {
        florist.addDecoration(material, price);
    }

    public String getStock() {
        String stock = "-[Stock] => [" + florist.getName() + "]-\n";
        for (Tree t : florist.getTrees()) {
            stock += "Tree - Height: " + t.getHeight() + ", Price: " + t.getPrice() + "\n";
        }

        stock += "\n";

        for (Flower f : florist.getFlowers()) {
            stock += "Flower - Color: " + f.getColor() + ", Price: " + f.getPrice() + "\n";
        }

        stock += "\n";

        for (Decoration d : florist.getDecorations()) {
            stock += "Decoration - Material: " + d.getMaterial() + ", Price: " + d.getPrice() + "\n";
        }

        return stock;
    }
}
