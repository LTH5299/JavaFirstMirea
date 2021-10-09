package ru.mirea.task11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Ex1 extends JFrame{
    JLabel lb = new JLabel("Guess number 1-20 ");
    JTextField t = new JTextField(10);
    JButton b = new JButton("CHECK");
    int n = (int)(Math.random() * 20 + 1);
    int times = 1;

    public Ex1(){
        super("Guess the number ");
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,300);
        setLayout(new FlowLayout());
        add(lb);
        add(t);
        add(b);

        b.addActionListener(e -> {
            if (times == 3 && Integer.parseInt(t.getText()) != n){
                JOptionPane.showMessageDialog(null,"You lose! The right number is: " + n);
                System.exit(0);
            }
            if(Integer.parseInt(t.getText()) == n)
            {
                JOptionPane.showMessageDialog(null,"You win!");
                System.exit(0);
            }
            else if(Integer.parseInt(t.getText()) > n && times!= 3){
                JOptionPane.showMessageDialog(null,"You need guess the smaller number");
                times++;
            }
            else if(Integer.parseInt(t.getText()) < n && times!= 3){
                JOptionPane.showMessageDialog(null,"You need guess the bigger number");
                times++;
            }
        });
    }

    public static void main (String[] args)
    {
        new Ex1();
    }

}

