package FileChooser;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class Frame extends JFrame implements ActionListener {

    JButton button = new JButton("Select File");

    Frame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("C:\\Users\\Momentum Performance\\Desktop\\"));
            int response = fileChooser.showOpenDialog(null);// Opens a file

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }

    }

}
