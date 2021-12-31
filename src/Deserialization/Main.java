import java.io.*;

public class Main {
    public static void main(String[] arges) {

        // Steps to Deserialize
        // ---------------------------------------------------------------
        // 1. Your class should implement Serializable interface
        // 2. add import java.io.Serializable;
        // 3. FileInputStream fileIn = new FileInputStream(file path);
        // 4. ObjectInputStream in = new ObjectInputStream(fileIn);
        // 5. objectName = (Class) in.readObject();
        // 6. in.close(); fileIn.close();
        // ---------------------------------------------------------------

        User user = null;

        FileInputStream fileIn;
        try {
            fileIn = new FileInputStream("C:\\Users\\Momentum Performance\\Desktop\\Serialization\\info.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (User) in.readObject();
            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("name: " + user.name);
        System.out.println("password " + user.password);
    }
}