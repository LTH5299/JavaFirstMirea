package ru.mirea.task26;

public class Main {
    public static void main(String[] args){
        Rate GPA = new Rate(new GPA_3());
        System.out.println("This is -  " + GPA.Score(3));

        GPA = new Rate(new GPA_4());
        System.out.println("This is -  " + GPA.Score(4));

        GPA = new Rate(new GPA_5());
        System.out.println("This is -  " + GPA.Score(5));
    }
}
