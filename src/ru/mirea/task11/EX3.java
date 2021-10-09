package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextArea;

public class EX3 extends JFrame {
    static JFrame f;
    static JButton b1, b2, b3;
    static JButton a1,a2,a3;
    static JLabel l, l1;
    static JTextArea jt;

    EX3() {
    }

    public static void main(String[] args) {
        f = new JFrame("MENU");
        f.setLocationRelativeTo(null);
        l = new JLabel("nothing entered");
        l1 = new JLabel("0 lines");
        b1 = new JButton("plain");
        b2 = new JButton("italic");
        b3 = new JButton("bold");
        a1 = new JButton("red");
        a2 = new JButton("blue");
        a3 = new JButton("green");
        EX3 te = new EX3();
        b1.addActionListener(e -> {
            Font f = new Font("Serif", Font.PLAIN, 15);
            jt.setFont(f);
        });
        b2.addActionListener(e -> {
            Font f = new Font("Serif", Font.ITALIC, 15);
            jt.setFont(f);
        });
        b3.addActionListener(e -> {
            Font f = new Font("Serif", Font.BOLD, 15);
            jt.setFont(f);
        });
        a1.addActionListener(e -> {
            Color f = new Color(100,1,1);
            jt.setForeground(f);
        });
        a2.addActionListener(e -> {
            Color f = new Color(1, 11, 100);
            jt.setForeground(f);
        });
        a3.addActionListener(e -> {
            Color f = new Color(4, 100, 1);
            jt.setForeground(f);
        });
        // create a text area, specifying the rows and columns
        jt = new JTextArea(" ", 10, 10);
        JPanel p = new JPanel();
        // add the text area and button to panel
        p.add(jt);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(a1);
        p.add(a2);
        p.add(a3);
        p.add(l);
        p.add(l1);
        f.add(p);
        f.setSize(600, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}