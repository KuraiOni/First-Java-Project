package Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MyFrame extends JFrame {
    MyFrame() {

        ImageIcon icon = new ImageIcon("2521671.jpg");// Create an image icon
        ImageIcon icon1 = new ImageIcon("download (1).png");// Create an image icon
        Border border = BorderFactory.createLineBorder(Color.green, 3);// create a border

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(0, 0, 500, 500);
        bluePanel.setLayout(null);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        yellowPanel.setBounds(500, 500, 500, 500);
        yellowPanel.setLayout(null);

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
        this.setLayout(null);
        this.add(yellowPanel);
        // this.pack();
        this.add(bluePanel);
        bluePanel.add(label);
        yellowPanel.add(label2);

        this.setIconImage(icon.getImage());// changes the icon for GUI
        this.getContentPane().setBackground(new Color(123, 50, 250)); // rgb colors
        // frame.getContentPane().setBackground(Color.CYAN); //normal way to set a color
        // frame.getContentPane().setBackground(new Color(0x000000)); // hex code
    }
}
