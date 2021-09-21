package ru.mirea.task3;

import java.util.Arrays;

import static java.lang.System.*;

public class TestBook {
    public static void main(String[] args) {
        var d1 = new Book("Human", "Anna", 40, 5, 2003);
        var d2 = new Book("Baby name","Eleanor",45, 4.5,1897);
        var d3 = new Book("Avocado","James",50,4,1999);
        out.println(d1);
        for (Book book : Arrays.asList(d1, d2, d3)) {
            book.intoBook();
        }
    }
}
