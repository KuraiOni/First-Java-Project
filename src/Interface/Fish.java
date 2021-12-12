package Interface;

public class Fish extends Animal implements Prey, Preditor {
    @Override
    public void flee() {
        System.out.println("The rabbit is fleeing");
    }

    @Override
    public void hunt() {
        System.out.println("The Fish is hunting");
    }

    void id() {
        System.out.println("I am a fish");
    }
}
