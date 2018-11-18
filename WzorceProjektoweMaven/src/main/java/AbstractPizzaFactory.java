public class AbstractPizzaFactory {

    // id 1 = Dragon Pizza restaurant
    // id 2 = Krokodyl Pizza restaurant
    // default pizza factory
    public Factory<Pizza> getPizza(int id){
        Factory<Pizza> result;

        switch (id){
            case 1:
                result = new DragonPizzaFactory();
                break;

            case 2:
                result = new KrokodylPizzaFactory();
                break;

                default:
                    result = new PizzaFactory();
                    break;

        }
        return result;
    }

}
