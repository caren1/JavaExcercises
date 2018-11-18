public class CarBuilder {

    private String colour;
    private String brand;
    private float engineVolume;
    private int doorsNumber;
    private int productionYear;
    private int model;

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public Car build() {
        return new Car(colour, brand, engineVolume, doorsNumber, productionYear, model);

    }

}
