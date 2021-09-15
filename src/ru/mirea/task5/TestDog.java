package ru.mirea.task5;

import java.util.Arrays;

public class TestDog {
        public static void main(String[] args) {
            final var b1 = new Dog("Bun", "Yellow","Golden Retriever",4);
            final var b2 = new Dog("Min", "Yellow-White","Chihuahua",2);
            final var b3 = new Dog("So", "White-Black","Pug",5);
            for (Dog dog : Arrays.asList(b1, b2, b3)) {
                System.out.println(dog);
            }
        }
}
