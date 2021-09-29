package ru.mirea.task8;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class draw extends JFrame{
    public draw() {
        setLayout(new GridLayout(5, 4));
        for (int i = 0; i < 20; i++){
            double n = (int) (Math.random() * 255) ;
            if ((n > 0) && (n < 100)) add(new Circle());
            if ((n>=100) && (n<179)) add(new Rectangle());
            if ((n >= 179) && (n <= 255)) add(new Triangle());
        }
    }
}
