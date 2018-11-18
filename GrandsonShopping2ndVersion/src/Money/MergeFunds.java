package Money;

import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeFunds implements BinaryOperator<IFundsOfMoney> {

    public MergeFunds() {
    }

    @Override
    public IFundsOfMoney apply(IFundsOfMoney iFundsOfMoney, IFundsOfMoney iFundsOfMoney2) {
        final Map<FormOfMoney, Integer> merged =
                Stream.concat(iFundsOfMoney.getFunds().entrySet().stream(),
                        iFundsOfMoney2.getFunds().entrySet().stream()
                )
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                Integer::sum
                        ));

        return new FundsOfMoney(merged);
    }
}
