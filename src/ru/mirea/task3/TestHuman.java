package ru.mirea.task3;

import java.util.Arrays;

import static java.lang.System.out;

public class TestHuman {
    public static void main(String[] args) {
        Human human = new Human();
        human.setTall(2);
        human.getHand1().setSize("normal");
        System.out.println(human);
        }
}
