package Interface;

public class Rabbit extends Animal implements Prey {
    @Override
    public void flee() {
        System.out.println("The rabbit is fleeing");
    }

    void id() {
        System.out.println("I am a rabbit");
    }
}