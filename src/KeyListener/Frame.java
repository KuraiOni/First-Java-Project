package KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame implements KeyListener {

    JLabel label;

    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.black);

        label = new JLabel();
        label.setBounds(0, 0, 50, 50);
        label.setBackground(Color.RED);
        label.setOpaque(true);

        this.add(label);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 40:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("The keychar is: " + e.getKeyChar());
        System.out.println("The the keycode is: " + e.getKeyCode());

    }

}