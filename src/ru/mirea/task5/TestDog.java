package ru.mirea.task5;

import java.util.Arrays;

public class TestDog {
        public static void main(String[] args) {
            final var b1 = new Chihuahua("Bun", "Yellow",4);
            final var b2 = new GoldenRetriever("Min", "Yellow-White",3);
            for (Dog dog : Arrays.asList(b1, b2)) {
                System.out.println(dog);
            }
        }
}
