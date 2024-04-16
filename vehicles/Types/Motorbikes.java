package vehicles.types;

import vehicles.MotorbikesAbstractClass;

public class Motorbikes extends MotorbikesAbstractClass {
    double hp;
    public Motorbikes(double displacement, String category, int numberOfWheels, double kms, boolean started, String brand, String model, double price, double hp) {
        this.displacement = displacement;
        this.category = category;
        this.numberOfWheels = numberOfWheels;
        this.kms = kms;
        this.started = started;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.hp = hp;
    }
    public double getHp() {
        return hp;
    }
    public void setHp(double hp) {
        this.hp = hp;
    }
    @Override
    public String toString() {
        return "Motorbikes [displacement=" + displacement + ", category=" + category + ", hp=" + hp
                + ", numberOfWheels=" + numberOfWheels + ", kms=" + kms + ", started=" + started + ", brand=" + brand
                + ", model=" + model + ", price=" + price + "]";
    }
    
}
