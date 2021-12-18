package Slider;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Frame implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    Frame() {

        frame = new JFrame("Slider Demo");
        label = new JLabel();
        panel = new JPanel();
        slider = new JSlider(0, 100, 50);// first-point,end-point,start-point

        slider.setPreferredSize(new Dimension(400, 250));
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(25);
        slider.setMinorTickSpacing(10);
        slider.setPaintLabels(true);
        slider.setForeground(new Color(0x00ff00));
        slider.setFont(new Font("MV BOLI", Font.PLAIN, 15));
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        label.setFont(new Font("MV BOLI", Font.PLAIN, 25));
        label.setText("°C = " + slider.getValue());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);

        frame.add(panel);
        panel.add(slider);
        panel.add(label);

        frame.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = " + slider.getValue());

    }
}
