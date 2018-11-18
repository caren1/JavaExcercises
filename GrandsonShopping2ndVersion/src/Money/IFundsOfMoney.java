package Money;

import java.util.Map;

public interface IFundsOfMoney {

    Map<FormOfMoney, Integer> getFunds();

    //kwota w danej formie pieniedzy
    Integer getAmount (FormOfMoney formOfMoney);

    //kwota wszystkich form pieniedzy
    Integer getAmount();

}
