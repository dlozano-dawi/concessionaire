package vehicles;

public abstract class CarsAbstractClass {
    protected double hp;
    protected boolean started;
    protected String brand;
    protected String model;
    protected double price;

    public boolean isStarted() {
        return started;
    }
    public String turnOn() {
        this.started = true;
        return "Turned On";
    }
    public String turnOff() {
        this.started = false;
        return "Turned Off";
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getHp() {
        return hp;
    }
    public void setHp(double hp) {
        this.hp = hp;
    }
}