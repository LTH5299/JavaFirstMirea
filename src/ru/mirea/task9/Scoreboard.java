package ru.mirea.task9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serial;
import java.util.Objects;


public class Scoreboard extends JFrame{
    @Serial
    private static final long serialVersionUID = 1L;
    static int scoreOfACMilan = 0;
    static int scoreOfRealMadrid = 0;
    JButton buttonACMilan;
    JButton buttonRealMadrid;
    JLabel labelResult;
    JLabel labelLastScores;
    JLabel labelWinner;
    JLabel logo1;
    JLabel logo2;
    private final ImageIcon ACMilanLogo = new ImageIcon(Objects.requireNonNull(getClass().getResource("ACmilan.png")));

    private final ImageIcon RealMadridLogo = new ImageIcon(Objects.requireNonNull(getClass().getResource("RealMadrid.png")));

    Font  f1  = new Font(Font.SERIF, Font.PLAIN,  15);
    Font  f2  = new Font(Font.DIALOG,  Font.BOLD, 15);
    public Scoreboard() {
        super("Scoreboard");
        setLayout(new GridLayout(2, 4));

        logo1 = new JLabel(ACMilanLogo);
        logo1.setSize(30, 30);
        add(logo1);

        buttonACMilan = new JButton("AC Milan");
        add(buttonACMilan);
        buttonACMilan.addMouseListener(new ACMilanListener());
        buttonACMilan.setBackground(Color.RED);
        buttonACMilan.setForeground(Color.BLACK);
        buttonACMilan.setFont(f2);


        buttonRealMadrid = new JButton("Real Madrid");
        add(buttonRealMadrid);
        buttonRealMadrid.addMouseListener(new RealMadridListener());
        buttonRealMadrid.setBackground(Color.WHITE);
        buttonRealMadrid.setForeground(Color.BLACK);
        buttonRealMadrid.setFont(f2);

        logo2 = new JLabel(RealMadridLogo);
        logo2.setSize(30, 30);
        add(logo2);

        labelResult = new JLabel("Result: 0 x 0");
        add(labelResult);
        labelResult.setFont(f1);

        labelLastScores = new JLabel("Last Scores: N/A");
        add(labelLastScores);
        labelLastScores.setFont(f1);

        labelWinner = new JLabel("Winner: DRAW");
        add(labelWinner);
        labelWinner.setFont(f1);
    }

    public class ACMilanListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            scoreOfACMilan++;
            labelResult.setText(String.format("Result: %d x %d", scoreOfACMilan, scoreOfRealMadrid));
            labelLastScores.setText("Last Scores: AC Milan");

            if (!(scoreOfACMilan <= scoreOfRealMadrid)) {
                labelWinner.setText("Winner: AC Milan");
            } else if (scoreOfACMilan >= scoreOfRealMadrid) {
                labelWinner.setText("Winner: DRAW");
            } else {
                labelWinner.setText("Winner: Real Madrid");
            }
        }
    }

    public class RealMadridListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            scoreOfRealMadrid++;
            labelResult.setText(String.format("Result: %d x %d", scoreOfACMilan, scoreOfRealMadrid));
            labelLastScores.setText("Last Scores: Real Madrid");

            if (scoreOfACMilan > scoreOfRealMadrid) {
                labelWinner.setText("Winner: AC Milan");
            } else if (scoreOfACMilan < scoreOfRealMadrid) {
                labelWinner.setText("Winner: Real Madrid");
            } else {
                labelWinner.setText("Winner: DRAW");
            }
        }
    }

    public static void main(String[] args) {
        Scoreboard sb = new Scoreboard();
        sb.setSize(800, 200);
        sb.setLocationRelativeTo(null);
        sb.setVisible(true);
        sb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
