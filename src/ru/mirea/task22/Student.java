package ru.mirea.task22;
//super class
public abstract class Student {
    public abstract String getID();
    public abstract String getName();
    public abstract String getBirthday();
    public abstract String getGender();
    public abstract String getBirthplace();
    public abstract float getGPA();

    @Override
    public String toString() {
        return "Student {" +
                "ID='" + this.getID() + '\'' +
                ", Name='" + this.getName() + '\'' +
                ", Birthday='" + this.getBirthday() + '\'' +
                ", Gender='" + this.getGender() + '\'' +
                ", Birthplace='" + this.getBirthplace() + '\'' +
                ", GPA=" + this.getGPA() +
                 '}';
    }
}
