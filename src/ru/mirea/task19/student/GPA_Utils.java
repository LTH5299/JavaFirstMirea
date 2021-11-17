package ru.mirea.task19.student;

public class GPA_Utils {
    public static void checkGPA(int mark) throws GPA_Super,  GPA_Pass {
        if (mark < 3) {
            throw new GPA_Pass("You have to retake the exam:  " + mark );
        } else if (mark > 5) {
            throw new GPA_Super("Invalid score. Need to reconsider:  " + mark );
        }
        System.out.println("Mark: " + mark + " OK!");
    }
}
