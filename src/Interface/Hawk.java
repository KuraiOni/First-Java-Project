package Interface;

public class Hawk extends Animal implements Preditor {
    @Override
    public void hunt() {
        System.out.println("The hawk is hunting");
    }

    void id() {
        System.out.println("I am a hawk");
    }
}
