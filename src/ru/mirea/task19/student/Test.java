package ru.mirea.task19.student;

public class Test {
    public static void main(String[] args) {

        // One student test. I use _ Wrap an Exception in another Exception
        Student student = new Student("001", "Jennie", "20-10-2003","Female",4);

        try {

            ValidateUtils.checkStudent(student);

        } catch (ValidateException wrap) {

            Exception cause = (Exception) wrap.getCause();

            if (cause != null) {
                System.out.println("Not pass, cause: " + cause.getMessage());
            } else {
                System.out.println(wrap.getMessage());
            }

        }
    }

}
