package ru.mirea.task1;

import java.util.Scanner;

public class ex2 {
        public static void main(String[] args) {
            System.out.println("enter number of elements in the array: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<arr.length; i++){
                System.out.print("enter the element "+(i+1)+": ");
                arr[i] = scanner.nextInt();
            }
            scanner.close();
            System.out.println("Array: ");
            for (int j : arr) System.out.print(j + "\t");
        }
}
