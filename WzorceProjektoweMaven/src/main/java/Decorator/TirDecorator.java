package Decorator;

public class TirDecorator {

    private Car car;

    public TirDecorator(Car car){
        this.car = car;
    }

    public void start(){
        this.car.start();
        System.out.println("Getting into the move, I am the sherrif of left lane.");

    }
    public void accelerate(){
        System.out.println("Using the horn to scare the passers.");
        this.car.accelerate();
    }

    public void pack(){
        System.out.println("Asking the loosers to pack the semitrailer.");
    }
}
