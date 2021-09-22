package ru.mirea.task6;

public class testAnimal {

    public static void main (String[] args)
    {
        Animal[] a = new Animal[]{new Lion("Tigger"), new Dog("Chobby")};
        for (Animal animal : a)
        {
            animal.eat();
        }
    }
}
