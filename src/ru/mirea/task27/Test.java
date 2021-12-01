package ru.mirea.task27;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Test {

        public static void menu() {
            System.out.println("1.Enter students");
            System.out.println("2.Show students");
            System.out.println("3.Find students");
            System.out.println("0.Exit");
        }

        public static void main(String[] args) {
            HashMap map = new HashMap();
            Scanner input = new Scanner(System.in);
            while (true) {
                menu();
                int choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Enter number students: ");
                        int n = Integer.parseInt(input.nextLine());
                        for(int i=0;i<n;i++){
                            Student std = new Student();
                            System.out.println("\nStudent "+(i+1));
                            std.input();
                            map.put(std.getID(), std);
                        }
                        break;
                    case 2:
                        for (Object value : map.values()) {
                            System.out.println(value);
                        }
                        break;
                    case 3:
                        System.out.println("Enter ID :");
                        String ID = input.nextLine();
                        if(map.containsKey(ID)){
                            System.out.println(map.get(ID));
                        }else{
                            System.out.println("Student ID isn't exists!");
                        }
                        break;
                    default: System.exit(0);
                }
            }
        }
}
