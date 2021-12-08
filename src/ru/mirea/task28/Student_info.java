package ru.mirea.task28;

import java.util.Scanner;

public class Student_info {
    private String ID;
    private String Name;
    private int score;

    // static_ class
    static class Sex {
        void display(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter gender: ");
            String sex = input.nextLine();
            System.out.println("Gender Student: " + sex);
        }
    }

    //inner class
    public Student_info(String id, String name, int score) {
        this.ID = id;
        this.Name = name;
        this.score = score;
    }
    class StudentOperator {
        public void print() {
            System.out.println(ID + " -  " + Name + " -  "+ score + ": ");
        }
        public void type() {
            if(score == 5) {
                System.out.println("SUPER");
            } else if (score == 4) {
                System.out.println("GOOD");
            }
            else {
                if (score == 3)
                System.out.println("PASS");
            }
        }
    }
    public void type_Student() {
        Student_info.StudentOperator studentOperator = this.new StudentOperator();
        studentOperator.print();
        studentOperator.type();
    }

    //static member
    static int x = 10;
}
