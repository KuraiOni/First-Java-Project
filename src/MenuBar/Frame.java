package MenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu File;
    JMenu Edit;
    JMenu Help;
    JMenuItem Load;
    JMenuItem Save;
    JMenuItem Exit;

    Frame() {

        menuBar = new JMenuBar();
        File = new JMenu("File");
        Edit = new JMenu("Edit");
        Help = new JMenu("Help");

        Load = new JMenuItem("Load");
        Save = new JMenuItem("Save");
        Exit = new JMenuItem("Exit");

        menuBar.add(File);
        menuBar.add(Edit);
        menuBar.add(Help);

        Load.addActionListener(this);
        Save.addActionListener(this);
        Exit.addActionListener(this);

        File.add(Load);
        File.add(Save);
        File.add(Exit);

        Load.setMnemonic(KeyEvent.VK_L);
        Save.setMnemonic(KeyEvent.VK_S);
        Exit.setMnemonic(KeyEvent.VK_E);

        File.setMnemonic(KeyEvent.VK_F);// Alt+F
        Edit.setMnemonic(KeyEvent.VK_E);// Alt+E
        Help.setMnemonic(KeyEvent.VK_H);// Alt+H

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Load) {
            System.out.println("You are loading...");
        } else if (e.getSource() == Save) {
            System.out.println("You are saving...");
        } else if (e.getSource() == Exit) {
            System.exit(0);
        }

    }

}