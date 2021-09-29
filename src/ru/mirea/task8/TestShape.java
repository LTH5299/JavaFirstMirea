package ru.mirea.task8;
import javax.swing.JFrame;

public class TestShape {
    public static void main(String[] args) {
        draw d = new draw();
        d.setSize(500,400);
        d.setLocationRelativeTo(null);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d.setVisible(true);
    }
}
