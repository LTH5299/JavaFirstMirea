package ru.mirea.task22;
//subclass
public class Student_IT extends Student {
    private String ID;
    private String Name;
    private String Birthday;
    private String Gender;
    private String Birthplace;
    private float GPA;

    public Student_IT(String ID, String Name,String Birthday, String Gender, String Birthplace, Float GPA) {
        this.ID = ID;
        this.Name = Name;
        this.Birthday = Birthday;
        this.Gender = Gender;
        this.Birthplace = Birthplace;
        this.GPA = GPA;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public String getGender() {
        return Gender;
    }

    public String getBirthplace() {
        return Birthplace;
    }

    public float getGPA() {
        return GPA;
    }
}

