package ru.mirea.task29;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class SerializationExample {
    public static void main(String[] args) {
        // Create Student object
        //convert the Student object and save its to a file
        Student student = new Student();
        student.setId("2020L1");
        student.setName("Alex");
        student.setGpa(5);
        // Use FileOutputStream to save the Student object into a file
        try (FileOutputStream fos = new FileOutputStream("D:\\Java\\student.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(student);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
