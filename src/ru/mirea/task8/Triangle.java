package ru.mirea.task8;
import java.awt.*;

public class Triangle extends paint {
    protected void paintShape(Graphics g) {
        int r = (int) (Math.random() * 255);
        int gr = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        g.setColor(new Color(r, gr, b));
        g.drawLine(4, getHeight() - 8, getWidth() / 2 - 4, 4);
        g.drawLine(getWidth() / 2 - 4, 5, getWidth() - 8, getHeight() - 8);
        g.drawLine(getWidth() - 8, getHeight() - 8, 4, getHeight() - 8);
    }
}
