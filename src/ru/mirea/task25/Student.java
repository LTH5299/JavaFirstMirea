package ru.mirea.task25;

public class Student {
    private String name;
    private int ID;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

}
