package LauchingWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launching implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton();

    Launching(){


        this.button.setText("Open");
        this.button.setBounds(50,75, 100,50);
        this.button.addActionListener(this);
        this.button.setForeground(Color.pink);
        this.button.setOpaque(true);
        this.button.setFocusable(false);

        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLayout(null);
        this.frame.setVisible(true);
        this.frame.setSize(200,200);
        this.frame.add(this.button);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button){
            int confirm = JOptionPane.showConfirmDialog(null, "do you want to continue?");
            if (confirm == 0) {
                frame.dispose();
                Window window = new Window();
            }
        }
    }
}
