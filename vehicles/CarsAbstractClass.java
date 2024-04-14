package vehicles;

public abstract class CarsAbstractClass {
    public double hp;
    public boolean started;
    public String brand;
    public String model;
    public double price;

    public boolean isStarted() {
        return started;
    }
    public void turnOn() {
        this.started = true;
    }
    public void turnOff() {
        this.started = false;
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