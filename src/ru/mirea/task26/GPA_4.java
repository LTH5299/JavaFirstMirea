package ru.mirea.task26;

public class GPA_4 implements Student_rate{

    @Override
    public String Rating(int GPA) {
        return "Student receives  " + GPA +" : GOOD";
    }
}
