package prac4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scores extends JFrame {
    private final String milan = "AC Milan";
    private final String madrid = "Real Madrid";
    private final String result = "Result: ";
    private final String lscorer = "Last Scorer: ";
    private final String winner = "Winner: ";
    int scoreMilan = 0;
    int scoreMadrid = 0;
    JButton btnMilan = new JButton("AC Milan");
    JButton btnMadrid = new JButton("Real Madrid");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    JLabel res = new JLabel(result+scoreMilan+" X "+scoreMadrid);
    JLabel lastScorer = new JLabel(lscorer+"N/A");
    JLabel win = new JLabel(winner+"Draw");
    Scores(){
        super("Scores");
        setLayout(new GridLayout(2,2));
        setSize(1000,1000);
        //add(new JPanel());
        add(btnMadrid);
        add(new JPanel());
        add(btnMilan);
        //add(new JPanel());
        add(res);
        add(lastScorer);
        add(win);
        btnMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                scoreMadrid++;
                res.setText(result+scoreMadrid+" X "+scoreMilan);
                lastScorer.setText(lscorer+madrid);
                win.setText(winner+whoWinner(scoreMadrid, scoreMilan));
            }
        });
        btnMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                scoreMilan++;
                res.setText(result+scoreMadrid+" X "+scoreMilan);
                lastScorer.setText(lscorer+milan);
                win.setText(winner+whoWinner(scoreMadrid, scoreMilan));
            }
        });

        //jta.setForeground(Color.PINK);
        //jta.setFont(fnt);
        setVisible(true);
    }
    private String whoWinner(int a, int b){
        if(a>b) return madrid;
        else if (a<b) return milan;
        return "DRAW";
    }
    public static void main(String[] args) {
        new Scores();
    }
}
