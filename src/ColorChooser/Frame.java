package ColorChooser;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame implements ActionListener {

    JLabel label = new JLabel("Select a Color");
    JButton button = new JButton("Select Color");

    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);

        label.setBackground(Color.white);
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));
        label.setForeground(Color.GREEN);
        label.setOpaque(true);

        this.add(label);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();
            Color color = colorChooser.showDialog(null, "Choose now!!!", Color.BLACK);

            label.setForeground(color);
        }
    }
}