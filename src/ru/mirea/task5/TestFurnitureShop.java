package ru.mirea.task5;

import java.util.Arrays;

public class TestFurnitureShop {
    public static void main(String[] args) {
        final var b1 = new FurnitureShop("Desk", "Brown","Wood Laminate");
        final var b2 = new FurnitureShop("Table", "Yellow","bamboo and rattan wicker");
        final var b3 = new FurnitureShop("Wall tiles", "White-Black","Acrylic plastic board");
        for (FurnitureShop furnitureShop : Arrays.asList(b1, b2, b3)) {
            System.out.println(furnitureShop);
        }
    }
}
