package ru.mirea.task21;

import java.util.Comparator;

public class ComparebyGPA implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        var gpaCompare = Float.compare(o2.getGPA(), o1.getGPA());
        if (gpaCompare != 0) {
            return gpaCompare;
        } else
        {
            var nameCompare = o1.getFirstName().compareTo(o2.getFirstName());
            if (nameCompare != 0) return nameCompare;
            else return o1.getName().compareTo(o2.getName());
        }
    }
}
