package ru.mirea.task13;

import java.util.ArrayList;
class ArrayListTest {
    public static void main(String[] args) {

        java.util.ArrayList<String> states = new java.util.ArrayList<>();
        states.add("Germany");
        states.add("France");
        states.add("United Kingdom");
        states.add("Spain");
        states.add(1, "Italy");
        System.out.println(states.get(1));
        states.set(1, "Denmark");
        System.out.printf("There are %d items in the list \n", states.size());
        for(String state : states){

            System.out.println(state);
        }

        if(states.contains("Germany")){

            System.out.println("The list contains the state of Germany");
        }
        states.remove("Germany");
        states.remove(0);

        Object[] countries = states.toArray();
        for(Object country : countries){

            System.out.println(country);
        }
    }

}