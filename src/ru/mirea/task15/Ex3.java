package ru.mirea.task15;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap: ");
        String mycontent = sc.nextLine();
        try{
            PrintWriter file = new PrintWriter("D:/Java/test.txt");
            file.print(mycontent);

            file.close();

            System.out.println("Data successfully appended at the end of file");

        }catch(IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
}
