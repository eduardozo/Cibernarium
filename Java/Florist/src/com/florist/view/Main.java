package com.florist.view;

import com.florist.application.FloristController;
import com.florist.domain.Material;

public class Main {

    private static FloristController controller = new FloristController();

    public static void main(String[] args) throws Exception {

        controller.createFlorist("Barcelona Florist Store");
        controller.addTree(4, 15);
        controller.addTree(2, 11);
        controller.addFlower("Red", 4);
        controller.addDecoration(Material.PLASTIC, 7);
        controller.addDecoration(Material.WOOD, 12);
        controller.getStock();

    }
}
