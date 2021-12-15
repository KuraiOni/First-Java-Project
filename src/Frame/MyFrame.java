package Frame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JPanel yellowPanel;

    MyFrame() {

        ImageIcon icon = new ImageIcon("2521671.jpg");// Create an image icon
        ImageIcon icon1 = new ImageIcon("download (1).png");// Create an image icon
        Border border = BorderFactory.createLineBorder(Color.green, 3);// create a border

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setPreferredSize(new Dimension(100, 100));
        bluePanel.setLayout(null);

        yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        yellowPanel.setPreferredSize(new Dimension(100, 100));
        yellowPanel.setLayout(null);
        yellowPanel.setVisible(false);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.MAGENTA);
        buttonPanel.setPreferredSize(new Dimension(100, 100));

        button = new JButton();
        button.addActionListener(this);
        button.setPreferredSize(new Dimension(100, 100));
        button.setBackground(Color.lightGray);
        button.setText("Click here");
        // button.setIcon(icon1);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setIconTextGap(-15);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setFont(new Font("Italic", Font.BOLD, 25));
        button.setForeground(Color.ORANGE);
        button.setFocusable(false);

        JLabel label = new JLabel();
        label.setText("The Grind Never Stops");// sets a text
        label.setIcon(icon1);// sets an image
        label.setHorizontalTextPosition(JLabel.CENTER);// changes the text position relative to the image horizontally
        label.setVerticalTextPosition(JLabel.TOP);// changes the text position relative to the image vertically
        label.setForeground(Color.CYAN);// sets the font color
        label.setFont(new Font("MV Boli", Font.PLAIN, 50));// setsfont type,style and size
        label.setIconTextGap(-25);// sets the gap between the image and the text
        label.setBackground(Color.BLACK);// sets the color of the label
        label.setOpaque(true);// display background color
        label.setBorder(border);// sets a border
        label.setHorizontalAlignment(JLabel.CENTER);// sets the horizontal alignment of the label
        label.setVerticalAlignment(JLabel.CENTER);// sets the vertical alignment of the label
        label.setBounds(0, 0, 250, 250);// sets the X,Y,width,height boundaries
        // of the label

        JLabel label2 = new JLabel();
        label2.setText("label 2");
        label2.setIcon(icon1);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.TOP);
        label2.setIconTextGap(-25);
        label2.setBounds(0, 0, 250, 250);

        this.setTitle("KuraiOni GUI");// changes the title of the app
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// closes the app
        this.setVisible(true);// sets the visibility
        this.setSize(1000, 1000);// sets the x dimensions anf the y dimensions
        // this.setResizable(false);// GUI can't be resized
        this.setLayout(new BorderLayout());
        this.add(yellowPanel, BorderLayout.NORTH);
        // this.pack();
        this.add(bluePanel, BorderLayout.SOUTH);
        this.add(buttonPanel, BorderLayout.WEST);
        bluePanel.add(label);
        yellowPanel.add(label2);
        buttonPanel.add(button);
        // this.add(button);

        this.setIconImage(icon.getImage());// changes the icon for GUI
        this.getContentPane().setBackground(new Color(123, 50, 250)); // rgb colors
        // frame.getContentPane().setBackground(Color.CYAN); //normal way to set a color
        // frame.getContentPane().setBackground(new Color(0x000000)); // hex code
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            yellowPanel.setVisible(true);
        }

    }
}
