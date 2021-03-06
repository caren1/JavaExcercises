package SimpleMoneySources;

import Money.FormOfMoney;
import Money.FundsOfMoney;
import Money.IFundsOfMoney;
import Money.ISimpleSourceOfMoney;

public class Socket implements ISimpleSourceOfMoney {
    private FormOfMoney formOfMoney;
    private Integer amount;

    public int getAmount() {
        return amount;
    }

    public Socket(int amount) {
        this.formOfMoney = FormOfMoney.CASH;
        this.amount = amount;
    }

    @Override
    public void setAmount(Integer amount) {
        this.amount = amount;

    }

    @Override
    public void addAmount(Integer amount) {
        this.amount += amount;

    }

    @Override
    public Integer substractMoney(Integer amount) {
        Integer takenMoney = 0;

        if (this.amount >= amount) {
            takenMoney = amount;
            this.amount = this.amount - amount;
        } else {
            takenMoney = this.amount;
            this.amount = 0;
        }
        return takenMoney;
    }

    @Override
    public FormOfMoney getFormOfMoney() {
        return this.formOfMoney;
    }

    @Override
    public IFundsOfMoney takeAvailableFunds() {
        IFundsOfMoney fundsOfMoney = this.statusOfAvailableFunds();
        this.amount = 0;
        return fundsOfMoney;
    }

    @Override
    public IFundsOfMoney statusOfAvailableFunds() {
        return new FundsOfMoney(this.amount, this.formOfMoney);

    }
}
