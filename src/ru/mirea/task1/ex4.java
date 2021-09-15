package ru.mirea.task1;

import java.util.Random;
import java.util.Scanner;

public class ex4 {
        public static void Input(int[] a, int n) {

            Random rand = new Random();
            for(int i=0; i< n; i++) {
                a[i] = rand.nextInt(50);
            }
        }
        public static void Output(int[] a, int n)
        {
            for (int i = 0; i < n; i++) System.out.print(a[i] +  "\t");
        }
        public static void Sort(int[] a,int n)
        {
            int tempSort;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j <= n - 1; j++) {
                    if (a[i] < a[j]) {
                        tempSort = a[i];
                        a[i] = a[j];
                        a[j] = tempSort;
                    }
                }
            }
        }
        public static void main(String[] args)
        {
            System.out.println("enter number of elements in the array: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] a = new int[n];
            Input(a,n);
            System.out.println("Array: " );
            Output(a,n);
            Sort(a,n);
            System.out.println("\n" + "Sorted array: ");
            Output(a,n);
        }
}
