package ru.mirea.task15;
import java.io.*;
public class Ex2 {
    public static void main(String[] args)
    {
        File file = new File("D:/Java/test.txt");
        BufferedInputStream bis = null;
        FileInputStream  fis= null;

        try
        {
            //FileInputStream to read the file
            fis = new FileInputStream(file);

            bis = new BufferedInputStream(fis);
            while( bis.available() > 0 ){
                System.out.print((char)bis.read());
            }

        }catch(FileNotFoundException fnfe)
        {
            System.out.println("The specified file not found" + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("I/O Exception: " + ioe);
        }
        finally
        {
            try{
                if(bis != null)
                {
                    fis.close();
                    bis.close();
                }
            }catch(IOException ioe)
            {
                System.out.println("Error in InputStream close(): " + ioe);
            }
        }
    }
}
