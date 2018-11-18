package Decorator;

public class BMWDecorator {

    private Car car;

    public BMWDecorator(Car car){
        this.car = car;

    }
    public void start(){
        this.car.start();
        System.out.println("Running radio - DJ Tiesto : Adagio for Strings");
        this.car.accelerate();

    }

    public void sell(){
        System.out.println("I am driving with junk, but will not sell it.");
    }

    public void accelerate(){
        this.car.accelerate();
        System.out.println("The engine just have crashed, cannot accelerate.");
    }

    public void villageTuning(){
        System.out.println("Adding too big spoiler");
        System.out.println("Adding a huge exhaust");
        System.out.println("Removing winkers");
        System.out.println("Dog with shaking head");
        System.out.println("Hanging the tree");
    }
}
