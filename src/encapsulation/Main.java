package encapsulation;

public class Main {
    public static void main(String[] arges) {

        Car car1 = new Car("Cheverlote", "Camaro", 2020);
        // Car car2 = new Car("Lambo", "Truck", 2021);
        Car car2 = new Car(car1);

        // car2.copy(car1);

        // car1.setMake("Lambo");

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }
}
