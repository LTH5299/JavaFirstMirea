package ru.mirea.task23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ListStudent {
    private ArrayList<Student> ds;

    public ListStudent(){
        this.ds = new ArrayList<Student>();
    }

    public ListStudent(ArrayList<Student> ds){
        this.ds = ds;
    }

    // Add students to the list.
    public void ADD_student(Student st){
        this.ds.add(st);
    }

    //Print the list of students to the screen.
    public void Output_ListStudent(){
        for (Student student : ds){
            System.out.println(student);
        }
    }

    //Check if the list is empty or not.
    public boolean Check_EmptyList(){
        return this.ds.isEmpty();
    }

    //Get the number of students on the list.
    public int Number_ListStudent(){
        return this.ds.size();
    }

    //Check if a student exists in the list, based on the student ID.
    public boolean Check_ID(Student st){
        return this.ds.contains(st);
    }

    //Remove a student from the list based on the student ID.
    public boolean Remove_ID(Student st){
        return this.ds.remove(st);
    }

    //Search all students based on Name entered from keyboard.
    public void Find_Student(String name){
        for(Student student : ds){
            if(student.getName().indexOf(name) > 0){
                System.out.println(student);
            }
        }
    }

    //Output a list of students with high to low scores.
    public void Sort_ListStudent(){
        Collections.sort(this.ds, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGPA() < o2.getGPA()) return 1;
                else if (o1.getGPA() > o2.getGPA()) return -1;
                else return 0;
            }
        });
    }
}
