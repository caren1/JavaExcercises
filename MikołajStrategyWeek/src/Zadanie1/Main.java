package Zadanie1;

public class Main {
    public static void main(String[] args) {
        //double speed, double engineWear, double breaksWear, double gasReleased, CarMode mode)
        Car car = new Car(80.0, 3, 4, 1.5);
        System.out.println(car);
        System.out.println("--------");

        car.increaseSpeed();
        System.out.println(car);
        System.out.println("--------");

        car.decreaseSpeed();
        System.out.println(car);
        System.out.println("--------");

        car.setMode(new TurboMode());
        car.increaseSpeed();
        System.out.println(car);
        System.out.println("--------");

        car.decreaseSpeed();
        System.out.println(car);
        System.out.println("--------");
    }
}
