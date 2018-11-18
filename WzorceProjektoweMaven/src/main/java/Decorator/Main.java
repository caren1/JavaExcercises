package Decorator;

public class Main {
    public static void main(String[] args) {

        //

        Car car = new Car(10.0f, "PussyWagon", 4);

        BMWDecorator bmw = new BMWDecorator(car);
        TirDecorator tir = new TirDecorator(car);

        System.out.println("Accelerate");
        car.accelerate();
        bmw.accelerate();
        tir.accelerate();

        System.out.println("Start");
        car.start();
        bmw.start();
        tir.start();

        System.out.println("Sell");
        car.sell();
        bmw.sell();

        System.out.println("Custom action");
        bmw.villageTuning();
        tir.pack();
    }
}
