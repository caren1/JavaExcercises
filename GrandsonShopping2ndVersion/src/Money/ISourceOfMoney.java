package Money;

public interface ISourceOfMoney  {

    IFundsOfMoney takeAvailableFunds();

    IFundsOfMoney statusOfAvailableFunds();

//    IFundsOfMoney addMoney(FormOfMoney formOfMoney, Integer value);
}
