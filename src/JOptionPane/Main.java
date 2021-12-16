package JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] arges) {

        // JOptionPane.showMessageDialog(null, "I am using java!", "KuraiOni",
        // JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "VIRUS DETECTED!", "KuraiOni",
        // JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Hey there!", "KuraiOni",
        // JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "What's up?", "KuraiOni",
        // JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Something wemt wrong!", "KuraiOni",
        // JOptionPane.ERROR_MESSAGE);

        // JOptionPane.showInputDialog(null, "Type your opinion");
        // int answer = JOptionPane.showConfirmDialog(null, "Is it good?", "Yes/No",
        // JOptionPane.YES_NO_CANCEL_OPTION);

        ImageIcon icon = new ImageIcon("download (1).png");
        String[] option = { "Okay", "Nah", "Whatever" };

        JOptionPane.showOptionDialog(
                null,
                "are u sure?", "Option",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                option,
                1);
    }
}