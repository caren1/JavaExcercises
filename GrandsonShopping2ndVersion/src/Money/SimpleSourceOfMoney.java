package Money;

public abstract class SimpleSourceOfMoney implements ISourceOfMoney {

    private FormOfMoney formOfMoney;


    @Override
    public IFundsOfMoney takeAvailableFunds() {
        return null;
    }

    @Override
    public IFundsOfMoney statusOfAvailableFunds() {
        return null;
    }
}
