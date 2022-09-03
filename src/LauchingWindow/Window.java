package LauchingWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("how is it going!!");
    JButton button = new JButton("Back");

    Window(){
        this.button.setBounds(50,100,80,50);
        this.button.addActionListener(this);

        this.label.setBounds(50,5, 100,50);

        this.frame.setLayout(null);
        this.frame.add(this.label);
        this.frame.add(this.button);
        this.frame.setVisible(true);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(200,200);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button){
            frame.dispose();
            Launching launching = new Launching();
        }

    }
}
