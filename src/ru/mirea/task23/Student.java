package ru.mirea.task23;

import java.util.Objects;

public class Student implements Comparable<Student> {
        private String ID;
        private String Name;
        private String Birthday;
        private String Gender;
        private String Birthplace;
        private float GPA;

        public Student(String ID){
            this.ID =ID;
        }

        public Student(String ID, String Name, String Birthday, String Gender, String Birthplace, float GPA )
        {
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

        public void setID(String ID) {
            this.ID = ID;
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
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Birthplace='" + Birthplace + '\'' +
                ", GPA=" + GPA +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.ID.compareTo(o.ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return  Objects.equals(ID, student.ID);
    }
        //compare students

    @Override
    public int hashCode() {
        return Objects.hash(ID, Name, GPA);
    }
}
