package ru.mirea.task3;

import java.util.Arrays;

import static java.lang.System.out;

public class TestCircle {
    public static void main(String[] args) {
        var d1 = new Circle(3);
        var d2 = new Circle(4.5);
        var d3 = new Circle(5.43);
        out.println(d1);
        for (Circle circle : Arrays.asList(d1, d2, d3)) {
            circle.intoCircle();
        }
    }
}

