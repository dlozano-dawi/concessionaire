package vehicles;

public abstract class MotorbikesAbstractClass{
    protected double displacement;
    protected String category;
    protected int numberOfWheels;
    protected double kms;
    protected boolean started;
    protected String brand;
    protected String model;
    protected double price;

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
    public double getDisplacement() {
        return displacement;
    }
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public double getKms() {
        return kms;
    }
    public void setKms(double kms) {
        this.kms = kms;
    }
    
}