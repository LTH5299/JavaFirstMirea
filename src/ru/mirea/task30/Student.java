package ru.mirea.task30;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private double gpa;
    public Student(int id, String name, double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public  Student(){
        this(0,null,0);
    }

    public Student(Student other){
        this (Objects.requireNonNull(other.getId(),"Missing object!"),
             Objects.requireNonNull(other.getName(),"Missing Object!"),
             Objects.requireNonNull(other.getGpa(),"Missing object!"));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id = '" + id + '\'' +
                ", name = '" + name + '\'' +
                ", gpa = " + gpa +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (other == null)
            throw new NullPointerException("No object to compare with!");

        if (other.getClass().getName().equals("ru.mirea.task30.Student")) {
            Student ref = (Student) other;
            return (this.id == ref.getId());
        }
        else
            throw new ClassCastException("Different type!");
    }

    @Override
    public int hashCode() {
        return ((this.id >>> 4 ^ this.id << 2) & (~this.id | this.id << 5));
    }
}
