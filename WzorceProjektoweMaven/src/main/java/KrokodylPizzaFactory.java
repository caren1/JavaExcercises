public class KrokodylPizzaFactory implements Factory<Pizza> {

    public Pizza getSpecialOfTheDay(DayOfTheWeek day) {
        Pizza result;

        switch (day) {

            case Monday:
                result = new Pizza("KrokodylPizza - Dziuzepe", 32.0f, 25.0f, 0.1f);
                break;
            case Tuesday:
                result = new Pizza("KrokodylPizza -  Italiana", 32.0f, 22.0f, 0.1f);
                break;
            case Wednsday:
                result = new Pizza("KrokodylPizza - Karmazyn", 100.0f, 75.0f, 3.0f);
                break;
            case Thursday:
                result = new Pizza("KrokodylPizza - Bolognese", 80.0f, 28.0f, 100.f);
                break;
            case Friday:
                result = new Pizza("KrokodylPizza - Potato", 32.0f, 15.0f, 99.f);
                break;
            case Saturday:
                result = new Pizza("KrokodylPizza - Kapara", 40.0f, 29.0f, 10.0f);
                break;
            case Sunday:
                result = new Pizza("KrokodylPizza - Mielona", 50.0f, 20.0f, 1.2f);
                break;

            default:
                result = new Pizza("KrokodylPizza", 0.0f, 0.0f, 0.0f);
        }
        return result;
    }
}
