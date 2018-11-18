public class DragonPizzaFactory implements Factory<Pizza> {

    public Pizza getSpecialOfTheDay(DayOfTheWeek day) {
        Pizza result;

        switch (day){

            case Monday:
                result = new Pizza("DragonPizza - Soprano", 20.0f, 26.0f, 0.2f);
                break;
            case Tuesday:
                result = new Pizza("DragonPizza -  Hawaii", 25.0f, 30.f, 0.1f);
                break;
            case Wednsday:
                result = new Pizza("DragonPizza - Elegante", 90.0f, 23.0f, 3.0f);
                break;
            case Thursday:
                result = new Pizza("DragonPizza - Kebab", 80.0f, 28.0f, 100.f);
                break;
            case Friday:
                result = new Pizza("DragonPizza - Gyros", 15.0f, 15.0f, 99.f);
                break;
            case Saturday:
                result = new Pizza("DragonPizza - Miejska", 40.0f, 29.0f, 10.0f);
                break;
            case Sunday:
                result = new Pizza("DragonPizza - Kampari", 50.0f, 20.0f, 1.2f);
                break;

            default:
                result = new Pizza("DragonPizza", 0.0f, 0.0f, 0.0f);
        }
        return result;
    }
}
