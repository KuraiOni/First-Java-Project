package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] arges) {
        // file = An abstract representation of file and directory pathnames

        File file = new File("text-document.txt");

        try {
            FileWriter writer = new FileWriter("text-document.txt");
            writer.write("Wtvr comes to mind \nit is okay\n");
            writer.append("\n(Written by kuraioni)");
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (file.exists()) {
            System.out.println("That file exists! :O!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            // file.delete();
        } else {
            System.out.println("That file doesn't exist :(");
        }

        try {
            FileReader reader = new FileReader("text-document.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}