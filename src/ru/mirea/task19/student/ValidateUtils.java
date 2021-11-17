package ru.mirea.task19.student;

public class ValidateUtils {
    public static void checkStudent(Student student) throws ValidateException {
        try {

            GPA_Utils.checkGPA(student.getGPA());

        } catch (Exception e) {

            throw new ValidateException(e);

        }
    }
}
