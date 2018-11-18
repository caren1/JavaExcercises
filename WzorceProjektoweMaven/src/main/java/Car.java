public class Car {

    private String colour;
    private String brand;
    private float engineVolume;
    private int doorsNumber;
    private int productionYear;
    private int model;


    public Car(String colour, String brand, float engineVolume, int doorsNumber, int productionYear, int model) {
        this.colour = colour;
        this.brand = brand;
        this.engineVolume = engineVolume;
        this.doorsNumber = doorsNumber;
        this.productionYear = productionYear;
        this.model = model;
    }

    public Car(){

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
