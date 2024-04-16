package vehicles.types;

import vehicles.CarsAbstractClass;

public class Cars extends CarsAbstractClass{
    int doors;
    String category;
    double kms;
    
    public Cars(int doors, String category, double kms, double hp, boolean started, String brand, String model, double price) {
        this.doors = doors;
        this.category = category;
        this.kms = kms;
        this.hp = hp;
        this.started = started;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Cars [hp=" + hp + ", started=" + started + ", doors=" + doors + ", category=" + category + ", brand="
                + brand + ", kms=" + kms + ", model=" + model + ", price=" + price + "]";
    }

    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public double getKms() {
        return kms;
    }
    public void setKms(double kms) {
        this.kms = kms;
    }
}