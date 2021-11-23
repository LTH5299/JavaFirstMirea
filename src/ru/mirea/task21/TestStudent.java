package ru.mirea.task21;
import java.util.ArrayList;
import java.util.List;
public class TestStudent {
    public static void main(String[] args)
    {
        List<Student>  students = new ArrayList<>();
        CreatData (students);
        students.sort(new ComparebyGPA());
        ShowHeader();
        students.forEach(TestStudent::showData);
    }

    public static void ShowHeader(){
        System.out.printf("%-12s%-12s%-12s%-12s%-12s%-12s%-12.2s\n",
                "ID", "FirstName", "Name", "Birthday", "Gender", "Birthplace", "GPA");
    }

    public static void showData(Student student){
        System.out.printf("%-12s%-12s%-12s%-12s%-12s%-12s%-12.2f\n",
                student.getID(), student.getFirstName(), student.getName(), student.getBirthday(), student.getGender(), student.getBirthplace(), student.getGPA());
    }

    public static void CreatData(List<Student> students){
        students.add(new Student("2020I1","Le","Thanh","05/02/2003","FeMale","VietNam",5));
        students.add(new Student("2020I2","Kim","Jennie","04/03/2000","FeMale","Korea",4.5f));
        students.add(new Student("2020I3","Vlad","Xasa","05/07/2002","Male","Russia",4));
    }
}
