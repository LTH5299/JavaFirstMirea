package ru.mirea.task19.student;

public class Student {
    private String ID;
    private String Name;
    private String Birthday;
    private String Gender;
    private int GPA;

    public Student(String ID, String Name, String Birthday, String Gender, int GPA) {
        this.ID = ID;
        this.Name = Name;
        this.Birthday = Birthday;
        this.Gender = Gender;
        this.GPA = GPA;
    }

    // getter & setter
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    public String getGender (){
        return Gender;
    }

    public void setGender(String Gender){
        this.Gender = Gender;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
}