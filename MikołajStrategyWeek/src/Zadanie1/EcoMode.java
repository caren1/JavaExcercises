package Zadanie1;

public class EcoMode implements CarMode {
    @Override
    public String toString() {
        return "EcoMode";
    }

    @Override
    public double howMuchIncreaseSpeed() {
        return 3.0;
    }

    @Override
    public double howMuchDecreaseSpeed() {
        return 3.0;
    }

    @Override
    public double howMuchGasConsumptionIncreases() {
        return 0.01;
    }

    @Override
    public double howMuchEngineWearIncreases() {
        return 0.01;
    }

    @Override
    public double howMuchBreaksWearIncreases() {
        return 0.01;
    }
}
