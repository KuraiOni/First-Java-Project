package NewWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Click Here!");

    MyFrame() {

        button.addActionListener(this);
        button.setBounds(100, 150, 200, 200);
        button.setFocusable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        NewWindow newWindow = new NewWindow();
    }

}
