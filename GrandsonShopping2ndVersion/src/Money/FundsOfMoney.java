package Money;

import java.util.HashMap;
import java.util.Map;

public class FundsOfMoney implements IFundsOfMoney {

     private Map<FormOfMoney, Integer> funds = new HashMap<>();

    public FundsOfMoney() {

    }

    public FundsOfMoney(Integer amount, FormOfMoney formOfMoney) {
        this.funds.put(formOfMoney, amount);
    }

    public FundsOfMoney(Map<FormOfMoney, Integer> funds) {
        this.funds.putAll(funds);
    }

    @Override
    public Map<FormOfMoney, Integer> getFunds() {
        return funds;
    }

    @Override
    public Integer getAmount(FormOfMoney formOfMoney) {
        return this.funds.getOrDefault(formOfMoney, 0);

    }

    @Override
    public Integer getAmount() {
        return funds.values().stream().mapToInt(Integer::intValue).sum();

    }

}

