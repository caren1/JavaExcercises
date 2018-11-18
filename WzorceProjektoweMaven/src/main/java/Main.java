public class Main {
    public static void main(String[] args) {
//        Singleton s = Singleton.getInstance();
//        s.getLogin();
//        s.getPassword();

        HouseBuilder builder = new HouseBuilder();
        builder.setAdress("Swietojanska 88/4");

        House h = builder.build();
        System.out.println(h.getAdress());

        h = new HouseBuilderFluentApi()
                .setArea(89.0f)
                .setGarage(true)
                .build();

        Pizza p = new PizzaFactory().getSpecialOfTheDay(DayOfTheWeek.Friday);

        CarBuilder carB = new CarBuilder();
        carB.setBrand("BMW");

        Car c = carB.build();
        System.out.println(c.getBrand());

        c = new CarBuilderAPI()
                .setBrand("BMW")
                .setProductionYear(2018)
                .build();

        Pizza fromOrder = new AbstractPizzaFactory().getPizza(1).getSpecialOfTheDay(DayOfTheWeek.Monday);
        // fabryka daje gotowy produkt, fabryka fabryk
        // builder składa produkt z komponentów składowych

    }
}
