package ru.mirea.task10;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.print("arr [ "+(i+1)+" ] = ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("\n\nElements: ");
        for(int i : arr){
            System.out.println(i);
        }

        int max = 0;
        for (int i : arr)
        {
            if (i > max) max =i;
        }
        System.out.println("the largest value of the number in this sequence: " + max);
    }
}
