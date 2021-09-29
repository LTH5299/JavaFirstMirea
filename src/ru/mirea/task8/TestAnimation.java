package ru.mirea.task8;
import javax.swing.*;
import java.awt.*;

public class TestAnimation extends JFrame {
    public TestAnimation()
    {
        initUI();

    }

    private void initUI() {

        ImageIcon i = loadImage();

        JLabel label = new JLabel(i);

        createLayout(label);

        setTitle("Animation");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private ImageIcon loadImage() {

        return new ImageIcon("D:\\Java\\cute.gif");
    }

    private void createLayout(JComponent... arg) {

        Container pane = getContentPane ();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0]));

        gl.setVerticalGroup(gl.createParallelGroup()
                .addComponent(arg[0]));

        pack();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            TestAnimation t = new TestAnimation();
            t.setVisible(true);
        });
    }
}
