package ru.mirea.task28;

public class Test_nested {
    public static void main(String[] args){
        //static_class
        Student_info.Sex g = new Student_info.Sex();
        g.display();
        //test_ innerclass
        Student_info student = new Student_info("20L2020","Thanh",5);
        student.type_Student();


    }
}