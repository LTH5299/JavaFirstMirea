package ru.mirea.task5;

import java.util.Arrays;

public class TestDish {
    public static void main(String[] args) {
        final var b1 = new Dish("Seafood soup", "Red-Yellow-Green","Seafood and Vegetable");
        final var b2 = new Dish("Crab soup", "Orange","Crab and rice");
        final var b3 = new Dish("Kebab rice noodles", "White-Brown-Green","Pork, Vegetable,Noodles");
        for (Dish dish : Arrays.asList(b1, b2, b3)) {
            System.out.println(dish);
        }
    }
}
