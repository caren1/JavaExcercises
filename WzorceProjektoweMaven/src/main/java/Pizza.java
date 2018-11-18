public class Pizza {

    private String name;
    private float size;
    private float price;
    private float thickness;

    public Pizza(String name, float size, float price, float thickness) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.thickness = thickness;
    }

    public Pizza() {

    }

    public String getName() {
        return name;
    }

    public float getSize() {
        return size;
    }

    public float getPrice() {
        return price;
    }

    public float getThickness() {
        return thickness;
    }
}
