package ru.mirea.task25;

import java.util.LinkedList;
import java.util.List;

public class Team {
    private String name;
    private TrainingSystem ts;
    private List<Student> students;

    public Team(String name){
        this.name = name;
        this.students = new LinkedList<>();
    }

    public String getName(){
        return this.name;
    }

    public TrainingSystem getTs(){
        return this.ts;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setTs(TrainingSystem ts){
        this.ts = ts;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }
}
