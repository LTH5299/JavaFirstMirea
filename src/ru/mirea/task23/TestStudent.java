package ru.mirea.task23;

import java.util.List;
import java.util.Scanner;

public class TestStudent {
    private static Object ListStudent;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ListStudent ds = new ListStudent();
        int key = 0;


        do {
            System.out.println("MENU---------------------");
            System.out.println("Please select function: ");
            System.out.println(
                      "1.Add students to the list.\n"
                    + "2.Print the list of students to the screen.\n"
                    + "3.Check if the list is empty or not.\n"
                    + "4.Get the number of students on the list.\n"
                    + "5.Check if a student exists in the list, based on the student ID.\n"
                    + "6.Remove a student from the list based on the student ID..\n"
                    + "7.Search all students based on Name entered from keyboard.\n"
                    + "8.Output a list of students with high to low scores.\n"
                    + "0.Out program");
            key = sc.nextInt();
            sc.nextLine();

            if(key == 1 ) {
                    System.out.print("Input ID: ");
                    String ID = sc.nextLine();
                    System.out.print("Input Name: ");
                    String Name = sc.nextLine();
                    System.out.print("Input Birthday: ");
                    String Birthday = sc.nextLine();
                    System.out.print("Input Gender: ");
                    String Gender = sc.nextLine();
                    System.out.print("Input Birthplace: ");
                    String Birthplace = sc.nextLine();
                    System.out.print("Input GPA: ");
                    float GPA = sc.nextFloat();
                    Student st = new Student(ID, Name, Birthday, Gender, Birthplace, GPA);
                    ds.ADD_student(st);
            }
            else if(key == 2)
            {
                ds.Output_ListStudent();
            }
            else if(key == 3)
            {
                System.out.println("The list is empty: "+ ds.Check_EmptyList());
            }
            else if(key == 4)
            {
                System.out.println("Current quantity: " + ds.Number_ListStudent());
            }
            else if(key == 5)
            {
                System.out.println("Input ID: ");
                String ID = sc.nextLine();
                Student st = new Student(ID);
                System.out.println("Check students on the list: "+ds.Check_ID(st));
            }
            else if(key == 6)
            {
                System.out.println("Input ID: ");
                String ID = sc.nextLine();
                Student st = new Student(ID);
                System.out.println("Remove students from the list: "+ds.Remove_ID(st));
            }
            else if(key == 7)
            {
                System.out.println("Input Name: ");
                String Name = sc.nextLine();
                System.out.println("Search Results: ");
                ds.Find_Student(Name);
            }
            else if(key == 8){
                ds.Sort_ListStudent();
                ds.Output_ListStudent();
            }
        }while (key!=0);
    }
}
