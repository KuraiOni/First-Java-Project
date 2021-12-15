package Audio;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] arges)
            throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        File file = new File("Backwoods BBQ - Chris Haugen.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        Scanner scanner = new Scanner(System.in);
        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P for play, S for stop, R for reset, Q for quit");
            System.out.print("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q"):
                    clip.close();
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        }
        System.out.println("byeeeeee!");
        // scanner.close();
    }
}