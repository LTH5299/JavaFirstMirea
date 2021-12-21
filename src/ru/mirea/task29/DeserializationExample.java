package ru.mirea.task29;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//use the file I created
public class DeserializationExample {
    public static void main(String[] args) {
        Student student = null;
        try ( FileInputStream fos = new FileInputStream("D:\\Java\\student.txt");
        ObjectInputStream oos = new ObjectInputStream(fos); ) {
            student = (Student) oos.readObject();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.err.println(student.getId());
        System.err.println(student.getName());
        System.err.println(student.getGpa());
    }

}
////before and after the conversion, our Student object still has the information we saved before
