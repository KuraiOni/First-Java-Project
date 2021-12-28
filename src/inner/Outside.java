package inner;

public class Outside {

    String x = "Hello";

    public class Inside {

        String y = "World";

        public void greetings() {
            System.out.println(x + " " + y);
        }
    }

}