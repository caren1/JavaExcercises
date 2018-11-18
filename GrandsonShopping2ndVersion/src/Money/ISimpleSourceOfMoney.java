package Money;

public interface ISimpleSourceOfMoney extends ISourceOfMoney {


    void setAmount(Integer amount);

    void addAmount(Integer amount);

    //kwota ktora chcemy pobrac z prostego zrodla
    //zwracana kwota moze byc mniejsza lub rowna zawartosci
    //przyklad, chce pobrac 200pln ze zrodla ktore zwiera tylko 100pln

    Integer  substractMoney(Integer amount);

    FormOfMoney getFormOfMoney();
}
