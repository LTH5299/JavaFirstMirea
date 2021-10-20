package ru.mirea.task13;
import java.util.Arrays;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList states = new MyArrayList(10);
        states.add("Germany");
        states.add("France");
        states.add("United Kingdom");
        states.add("Spain");
        states.add(1, "Italy");
        System.out.println(states.get(1));
        states.set(1, "Denmark");
        System.out.println("There are %d items in the list \n");
        for (int i=0; i<states.size(); ++i) {
            System.out.println(states.get(i));
        }
        if(states.contains("Germany")){

            System.out.println("The list contains the state of Germany");
        }
        states.remove(0);
        for (int i=0; i<states.size(); ++i) {
            System.out.println(states.get(i));
        }

    }
}
