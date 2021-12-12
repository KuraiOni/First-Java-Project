package Interface;

public class Main {
    public static void main(String[] arges) {
        Fish fish = new Fish();
        Hawk hawk = new Hawk();
        Rabbit rabbit = new Rabbit();

        fish.hunt();

        // polymorphism

        Animal[] animals = { fish, hawk, rabbit };

        for (Animal x : animals) {
            x.id();
        }
    }
}
