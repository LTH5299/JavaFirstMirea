package ru.mirea.task22;
import ru.mirea.task22.Student_IT;
import ru.mirea.task22.Student_PS;
import ru.mirea.task22.Student;
public class StudentFactory {
    public static Student getStudent(String type,String ID, String Name,String Birthday, String Gender, String Birthplace, Float GPA){
        if("Student_IT".equalsIgnoreCase(type)) return new Student_IT(ID,Name,Birthday,Gender,Birthplace,GPA);
        else {
            if ("Student_Physical".equalsIgnoreCase(type))
                return new Student_PS(ID, Name, Birthday, Gender, Birthplace, GPA);
        }

            return null;
    }
}
