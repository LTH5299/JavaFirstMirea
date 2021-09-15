package ru.mirea.task1;
//С циклом for:
    import javax.swing.*;
    import java.util.Scanner;

    import static java.lang.System.*;

    public class ex1 {
        public static void main(String[] args) {
            System.out.println("enter number of elements in the array: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            double[] arr = new double[n];
            double sum = 0;
            for(int i=0; i<arr.length; i++){
                System.out.print("enter the element "+(i+1)+": ");
                arr[i] = scanner.nextDouble();
            }
            scanner.close();
            //for (int i=0; i<arr.length; i++) sum = sum + arr[i];
            int i=0;
            /*while (  i< arr.length)
            {
                sum = sum + arr[i];
                i++;
            }*/
            do
            {
                sum = sum + arr[i];
                i++;
            }while (i< arr.length);
            System.out.format("Total : %.3f", sum);
        }
    }
