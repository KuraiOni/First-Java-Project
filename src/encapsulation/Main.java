package encapsulation;

public class Main {
    public static void main(String[] arges) {

        Car car = new Car("Cheverlote", "Camaro", 2020);

        car.setMake("Lambo");

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}
