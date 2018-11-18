public class CarBuilderAPI implements Builder<Car> {

    private Car result;

    public CarBuilderAPI() {
        result = new Car();
    }

    public CarBuilderAPI setBrand(String brand) {
        result.setBrand(brand);
        return this;
    }

    public CarBuilderAPI setProductionYear(int productionYear){
        result.setProductionYear(productionYear);
        return this;
    }

    public Car build() {
        return null;
    }
}
