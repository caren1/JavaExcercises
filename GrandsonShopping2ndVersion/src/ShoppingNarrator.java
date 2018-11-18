import Money.FundsOfMoney;
import Money.IFundsOfMoney;
import Money.ISourceOfMoney;

import java.util.function.Consumer;

public class ShoppingNarrator {

    FundsOfMoney fundsOfMoney;


    Consumer<IFundsOfMoney> printFunds =
            fundsOfMoney -> fundsOfMoney.getFunds().forEach((key, value)
                    -> System.out.println(key + "  " + value)
            );


    public void printFunds(IFundsOfMoney funds) {
        printFunds.accept(funds);
    }

}
