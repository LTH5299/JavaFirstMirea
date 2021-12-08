package ru.mirea.task28;
import java.util.Scanner;

public class Student {
    public void Create_GPA(){

        // anonymous class implementing interface
        Student_GPA s = new Student_GPA() {
            @Override
            public void GPA() {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter GPA :");
                int GPA;
                     GPA = input.nextInt();
                     if ( GPA == 3) System.out.println("Student rate PASS");
                     else {
                         if (GPA == 4)  System.out.println("Student rate GOOD");
                         else  {
                             if (GPA == 5 ) System.out.println("Student rate SUPER");
                             else {
                                 if (GPA < 3) System.err.println("GPA must be 3 to 5!");
                                 return;
                             }
                             }
                         }
                     }
            };
        s.GPA();
        }
}
