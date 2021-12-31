import java.io.*;

public class Main {
    public static void main(String[] arges) throws IOException {

        // Steps to Serialize
        // ---------------------------------------------------------------
        // 1. Your class should implement Serializable interface
        // 2. add import java.io.Serializable;
        // 3. FileOutputStream fileOut = new FileOutputStream(file path)
        // 4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
        // 5. out.writeObject(objectName)
        // 6. out.close(); fileOut.close();
        // ---------------------------------------------------------------

        User user = new User();
        user.name = "KuraiOni";
        user.password = "1p387ge";

        FileOutputStream fileOut = new FileOutputStream("info.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Info Saved (:");
    }
}