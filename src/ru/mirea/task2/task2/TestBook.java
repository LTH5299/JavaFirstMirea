package ru.mirea.task2.task2;

public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Human", "Anna", 40, 5);
        Book d2 = new Book("Baby name","Eleanor",45, 4.5);
        Book d3 = new Book("Avocado","James",50,4);
        System.out.println(d1);
        d1.intoBook();
        d2.intoBook();
        d3.intoBook();
    }
}
