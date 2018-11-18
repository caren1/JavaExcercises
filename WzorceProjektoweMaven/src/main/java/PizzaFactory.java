public class PizzaFactory implements Factory<Pizza> {

    public Pizza getSpecialOfTheDay(DayOfTheWeek day) {
        //uwolnić się od IF
//        private final float thickness;
//
//        public PizzaFactory (float thickness){
//            this.thickness = thickness;


        Pizza result;

        switch (day) {

            case Monday:
                result = new Pizza("Soprano", 50.0f, 24.0f, 0.2f);
                break;
            case Tuesday:
                result = new Pizza("Capriciosa", 45.0f, 30.f, 0.1f);
                break;
            case Wednsday:
                result = new Pizza("Diabolo", 100.0f, 10.0f, 3.0f);
                break;
            case Thursday:
                result = new Pizza("Peperoni", 80.0f, 28.0f, 100.f);
                break;
            case Friday:
                result = new Pizza("Gyros", 15.0f, 15.0f, 99.f);
                break;
            case Saturday:
                result = new Pizza("Wiejska", 40.0f, 29.0f, 10.0f);
                break;
            case Sunday:
                result = new Pizza("Hera koka hash LSD", 50.0f, 20.0f, 1.2f);
                break;

            default:
                result = new Pizza(" ", 0.0f, 0.0f, 0.0f);
                break;
        }
        return result;
    }
}
