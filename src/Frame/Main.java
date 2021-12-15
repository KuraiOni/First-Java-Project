package Frame;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] arges) {

        /*
         * Normal way to create a GUI
         * 
         * JFrame frame = new JFrame();// creates a frame
         * frame.setTitle("KuraiOni GUI");// changes the title of the app
         * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// closes the app
         * frame.setVisible(true);// sets the visibility
         * frame.setSize(420, 420);// sets the x dimensions anf the y dimensions
         * frame.setResizable(false);// GUI can't be resized
         * 
         * ImageIcon icon = new ImageIcon("2521671.jpg");// Create an image icon
         * frame.setIconImage(icon.getImage());// changes the icon for GUI
         * frame.getContentPane().setBackground(new Color(123, 50, 250)); // rgb colors
         * // frame.getContentPane().setBackground(Color.CYAN); //normal way to set a
         * color
         * //frame.getContentPane().setBackground(new Color(0x000000)); // hex code
         */

        new MyFrame();

    }
}
