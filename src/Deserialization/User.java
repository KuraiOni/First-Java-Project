import java.io.*;

public class User implements Serializable {

    String name;
    String password;

    public void hello() {
        System.out.println("Hello" + name);
    }
}