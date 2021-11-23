package ru.mirea.task22;

public class TestFactory {
    public static void main(String[] args)
    {
        Student IT = StudentFactory.getStudent("Student_IT","2020I1","Thanh Hien","05/02/2003","FeMale","VietNam",5f);
        Student PS = StudentFactory.getStudent("Student_Physical","2020I3","Vlad Xasa","05/07/2002","Male","Russia",3.5f);
        System.out.println("Factory Student IT: " + IT);
        System.out.println("Factory Student Physical: " + PS);
    }

}
