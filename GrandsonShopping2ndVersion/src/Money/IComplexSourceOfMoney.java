package Money;

public interface IComplexSourceOfMoney extends ISourceOfMoney{

    void addSourceOfMoney(ISourceOfMoney... sourceOfMoney);

}
