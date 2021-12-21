package ru.mirea.task29;

import java.io.Serializable;

public class Student implements Serializable {
    //The purpose of this variable is to make sure before and after the conversion our Student class is a one
    private static final long serialVersionUID = 1L;
    private String name;
    private String id;
    private int gpa;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGpa() {
        return gpa;
    }
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}
