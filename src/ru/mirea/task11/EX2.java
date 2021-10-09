package ru.mirea.task11;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EX2 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public EX2() {
        prepareGUI();
    }

    public static void main(String[] args) {
        EX2 demo = new EX2();
        demo.showDialogDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java code Derection");
        mainFrame.setSize(300, 300);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(200, 100);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showDialogDemo() {
        headerLabel.setText("Control in action: Direction");
        JButton center = new JButton("Center");
        JButton west = new JButton("WEST");
        JButton south = new JButton("SOUTH");
        JButton north = new JButton("NORTH");
        JButton east = new JButton("EAST");
        center.addActionListener(e -> JOptionPane.showMessageDialog(mainFrame,
                "Welcome to Moscow"));
        west.addActionListener(e -> JOptionPane.showMessageDialog(mainFrame,
                "Welcome to Kaliningrad"));
        south.addActionListener(e -> JOptionPane.showMessageDialog(mainFrame,
                "Welcome to Baikal"));
        north.addActionListener(e -> JOptionPane.showMessageDialog(mainFrame,
                "Welcome to Saint Petersburg"));
        east.addActionListener(e -> JOptionPane.showMessageDialog(mainFrame,
                "Welcome to Vladivostok"));
        controlPanel.add(center);
        controlPanel.add(west);
        controlPanel.add(south);
        controlPanel.add(north);
        controlPanel.add(east);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

