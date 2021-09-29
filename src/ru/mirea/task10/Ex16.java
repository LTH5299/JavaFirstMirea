package ru.mirea.task10;

import java.util.Scanner;

public class Ex16 {
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
        sortASC(arr);
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == arr[arr.length - 1]) count ++;
        }

        System.out.println("The number of elements equal to the largest element is : "+ count);
    }

    public static void sortASC(int [] arr){
        int temp;
        for (int i=0; i < arr.length - 1; i++)
        {
            for (int j= i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
