package Zadanie1;

public class Car {

    private double speed;
    private double engineWear;
    private double breaksWear;
    private double gasReleased;
    CarMode mode;

    public Car(double speed, double engineWear, double breaksWear, double gasReleased) {
        this.speed = speed;
        this.engineWear = engineWear;
        this.breaksWear = breaksWear;
        this.gasReleased = gasReleased;
        this.mode = new NormalMode();
    }

    public void increaseSpeed() {
        speed += mode.howMuchIncreaseSpeed();
        engineWear += mode.howMuchEngineWearIncreases();
        gasReleased += mode.howMuchGasConsumptionIncreases();
    }

    public void decreaseSpeed() {
        speed -= mode.howMuchDecreaseSpeed();
        breaksWear -= mode.howMuchBreaksWearIncreases();
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", engineWear=" + engineWear +
                ", breaksWear=" + breaksWear +
                ", gasReleased=" + gasReleased +
                ", mode=" + mode +
                '}';
    }

    public double getEngineWear() {
        return engineWear;
    }

    public double getBreaksWear() {
        return breaksWear;
    }

    public double getGasReleased() {
        return gasReleased;
    }

    public void setMode(CarMode mode) {
        this.mode = mode;
    }

}
