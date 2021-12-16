package NewWindow;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hi there!");

    NewWindow() {

        label.setBounds(0, 100, 100, 50);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);

    }
}
