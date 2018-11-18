package Money;

public abstract class Person implements IComplexSourceOfMoney {

    public Person(String imie, Integer wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    private String imie;
    private Integer wiek;
    private ComplexSourceOfMoney complexSourceOfMoney = new ComplexSourceOfMoney();


    public void addSourceOfMoney(ISourceOfMoney... sourceOfMoney) {
        this.complexSourceOfMoney.addSourceOfMoney(sourceOfMoney);
    }

    public IFundsOfMoney takeAvailableFunds() {
        return this.complexSourceOfMoney.takeAvailableFunds();
    }

    public IFundsOfMoney statusOfAvailableFunds() {
        return this.complexSourceOfMoney.statusOfAvailableFunds();
    }
}


