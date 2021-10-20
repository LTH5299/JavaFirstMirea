package ru.mirea.task15;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args)
    {
        FileOutputStream fos = null;
        File file;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap: ");
        String mycontent = sc.nextLine();
        try {
            file = new File("D:/Java/test.txt");
            fos = new FileOutputStream(file);

            byte[] bytesArray = mycontent.getBytes();

            fos.write(bytesArray);
            fos.flush();
            System.out.println("File Written Successfully");
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        finally {
            try {
                if (fos != null)
                {
                    fos.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error in closing the Stream");
            }
        }
    }
}
