package Zadanie1;

public class NormalMode implements CarMode{

    @Override
    public String toString() {
        return "NormalMode";
    }

    @Override
    public double howMuchIncreaseSpeed() {
        return 5.0;
    }

    @Override
    public double howMuchDecreaseSpeed() {
        return 5.0;
    }

    @Override
    public double howMuchGasConsumptionIncreases() {
        return 0.02;
    }

    @Override
    public double howMuchEngineWearIncreases() {
        return 0.05;
    }

    @Override
    public double howMuchBreaksWearIncreases() {
        return 0.05;
    }
}
