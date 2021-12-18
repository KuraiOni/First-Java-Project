package PrograssBar;

import java.awt.*;
import javax.swing.*;

public class Frame {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 100);

    Frame() {
        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.RED);
        bar.setBackground(Color.BLACK);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

        frame.add(bar);

        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int counter = 100;

        while (counter > 0) {
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            counter--;
            bar.setString(counter + "/" + 100 + "HP");
        }

        bar.setString("Done :)");
    }

}
