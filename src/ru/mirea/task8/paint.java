package ru.mirea.task8;
import java.awt.Graphics;
import javax.swing.JComponent;

public abstract class paint extends JComponent {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintShape(g);
    }
    int r;
    int gr;
    int b;
    abstract protected void paintShape(Graphics g);
}
