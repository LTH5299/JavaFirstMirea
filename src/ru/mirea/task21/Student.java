package ru.mirea.task21;

import java.util.Objects;

public class Student {
    private String ID;
    private String FirstName;
    private String Name;
    private String Birthday;
    private String Gender;
    private String Birthplace;
    private float GPA;

    public Student(String ID, String FirstName, String Name, String Birthday, String Gender, String Birthplace, float GPA )
    {
        this.ID = ID;
        this.FirstName = FirstName;
        this.Name = Name;
        this.Birthday = Birthday;
        this.Gender = Gender;
        this.Birthplace = Birthplace;
        this.GPA = GPA;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getBirthplace() {
        return Birthplace;
    }

    public void setBirthplace(String birthplace) {
        Birthplace = birthplace;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Float.compare(student.GPA, GPA) == 0 && Objects.equals(ID, student.ID) && Objects.equals(FirstName, student.FirstName) && Objects.equals(Name, student.Name) && Objects.equals(Birthday, student.Birthday) && Objects.equals(Gender, student.Gender) && Objects.equals(Birthplace, student.Birthplace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, FirstName, Name, Birthday, Gender, Birthplace, GPA);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", Name='" + Name + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Birthplace='" + Birthplace + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
