package ru.mirea.task10;

import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter A: ");
        int A = scanner.nextInt();
        System.out.print("enter B: ");
        int B = scanner.nextInt();
        if (A < B )
        {
            for (int i = A; i <= B; i++)
            {
                System.out.print(i + " ");
            }
        }
        else
        {
            for (int i = A; i >= B; i--)
            {
                System.out.print(i + " ");
            }
        }
    }
}
