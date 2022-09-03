package Demos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SnakeGame extends JFrame {
    SnakeGame(){

        JButton tomas = new JButton("Start Game");
        tomas.setBounds(250,275, 100,50);
        tomas.setOpaque(true);

        tomas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == tomas){
                    new GameFrame();
                }
            }
        });

        this.setSize(600,600);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLayout(null);

        this.setLocationRelativeTo(null);
        this.add(tomas);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new SnakeGame();
//        new GameFrame();
    }

}
