package ru.mirea.task10;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scanner.nextInt();
        System.out.println("Triangular Sequence is: " );
        int k=1;
        for (int i = 1; i < n+1; i++)
        {
            System.out.print(k + " ");
            if (i == k*(k+1)/2)   k+=1;

        }
    }
}
