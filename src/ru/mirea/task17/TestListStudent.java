package ru.mirea.task17;

public class TestListStudent {
    public static void main(String[] args) {
        System.out.println("ID:   " + ListStudent.STUDENT_001.getID());
        System.out.print("    Name: " + ListStudent.STUDENT_001.getName());
        System.out.print("    Birthday: " + ListStudent.STUDENT_001.getBirthday());
        System.out.print("    Gender: " + ListStudent.STUDENT_001.getGender());
        System.out.println("    Birthplace: " + ListStudent.STUDENT_001.getBirthplace());

        System.out.println("ID:   " + ListStudent.STUDENT_002.getID());
        System.out.print("    Name: " + ListStudent.STUDENT_002.getName());
        System.out.print("    Birthday: " + ListStudent.STUDENT_002.getBirthday());
        System.out.print("    Gender: " + ListStudent.STUDENT_002.getGender());
        System.out.println("    Birthplace: " + ListStudent.STUDENT_002.getBirthplace());

        System.out.println("ID:   " + ListStudent.STUDENT_003.getID());
        System.out.print("    Name: " + ListStudent.STUDENT_003.getName());
        System.out.print("    Birthday: " + ListStudent.STUDENT_003.getBirthday());
        System.out.print("    Gender: " + ListStudent.STUDENT_003.getGender());
        System.out.println("    Birthplace: " + ListStudent.STUDENT_003.getBirthplace());
    }
}
