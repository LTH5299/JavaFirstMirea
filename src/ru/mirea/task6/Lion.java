package ru.mirea.task6;

public class Lion implements Animal {
    private String  animalName;

    public Lion(String animalName) {
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
        return "roar";
    }

    @Override
    public void eat() {
        System.out.println("Lions Devour");

    }

    @Override
    public String toString() {
        return "Lion{" +
                "animalName='" + animalName + '\'' +
                '}';
    }
}
