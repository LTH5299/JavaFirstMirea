package ru.mirea.task6;

import java.io.Console;

public class Dog implements Animal{
    private String  animalName;

    public Dog(String animalName) {
    }

    @Override
    public String getName() {
        return animalName;
    }

    @Override
    public void setName(String name) {
        animalName = name;

    }

    @Override
    public String makeSound() {
        return "woof";
    }

    @Override
    public void eat() {
       System.out.println("Dog chews a bone");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "animalName='" + animalName + '\'' +
                '}';
    }
}
