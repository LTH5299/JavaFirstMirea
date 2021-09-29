package ru.mirea.task10;

import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scanner.nextInt();
        System.out.println("sequence of natural numbers  " + n + " is: " );
        for (int i= 0; i< n; i++)
        {
            System.out.print(i+1 + "  ");
        }
    }
}
