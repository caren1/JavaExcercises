package Decorator;

public class Car {

    private float speed;
    private String name;
    private int seats;
    private float acceleration;

    public Car(float speed, String name, int seats){
        this.speed = speed;
        this.name = name;
        this.seats = seats;
        this.acceleration = 2.0f;

    }

    public void start(){
        System.out.println("Running the engine of the car.");
    }
    public void sell(){
        System.out.println("Selling the car.");
    }
    public void accelerate(){
        speed += acceleration;
        System.out.println("Accelerating : Increasing the speed of 2 m/s");
    }
}
