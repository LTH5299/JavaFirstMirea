package ru.mirea.task8;
import java.awt.*;

public class Rectangle extends paint{
    protected void paintShape(Graphics g) {
        int r = (int) (Math.random() * 255);
        int gr = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        g.setColor(new Color(r,gr,b));
        g.drawRect(4, 4, getWidth() - 8, getHeight() - 8);
    }
}
