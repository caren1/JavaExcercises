package Zadanie1;

public class TurboMode implements CarMode {

    @Override
    public String toString() {
        return "TurboMode";
    }

    @Override
    public double howMuchIncreaseSpeed() {
        return 10;
    }

    @Override
    public double howMuchDecreaseSpeed() {
        return 10;
    }

    @Override
    public double howMuchGasConsumptionIncreases() {
        return 0.05;
    }

    @Override
    public double howMuchEngineWearIncreases() {
        return 0.1;
    }

    @Override
    public double howMuchBreaksWearIncreases() {
        return 0.1;
    }
}

