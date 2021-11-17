package ru.mirea.task18.student;

public class TestGPA {
    public static void main(String[] args)
    {
        int mark = 2;
        System.out.println("Check your GPA: ");

        try {
            Check.checkGPA(mark);
            System.out.println("You pass!");

        } catch (GPAException e) {
            System.out.println("Your score error");
            System.out.println(e.getMessage());

        }
    }
}
