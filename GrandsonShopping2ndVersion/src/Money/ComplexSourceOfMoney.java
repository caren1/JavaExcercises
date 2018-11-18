package Money;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ComplexSourceOfMoney implements ISourceOfMoney {

    List<ISourceOfMoney> moneySources = new ArrayList<>();

    public void addSourceOfMoney(ISourceOfMoney... sourceOfMoney) {
        moneySources.addAll(Arrays.asList(sourceOfMoney));
    }

    @Override
    public IFundsOfMoney takeAvailableFunds() {
        return this.merge(ISourceOfMoney::takeAvailableFunds);
    }

    @Override
    public IFundsOfMoney statusOfAvailableFunds() {
        return this.merge(ISourceOfMoney::statusOfAvailableFunds);
    }

//    @Override
//    public IFundsOfMoney addMoney(FormOfMoney formOfMoney, Integer value) {
//        (formOfMoney, value);
//        return null

    private IFundsOfMoney merge(Function<ISourceOfMoney, IFundsOfMoney> mapper) {
        return this.moneySources.stream().map(mapper).reduce(new FundsOfMoney(), new MergeFunds());
    }
}
