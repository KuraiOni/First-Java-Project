package inner;

public class Main {
    public static void main(String[] arges) {
        Outside out = new Outside();
        Outside.Inside in = out.new Inside();

        in.greetings();
    }
}
