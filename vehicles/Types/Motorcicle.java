package vehicles.types;

import vehicles.MotorbikesAbstractClass;

public class Motorcicle extends MotorbikesAbstractClass{
    public Motorcicle(double displacement, String category, int numberOfWheels, double kms, boolean started, String brand, String model, double price) {
        this.displacement = displacement;
        this.category = category;
        this.numberOfWheels = numberOfWheels;
        this.kms = kms;
        this.started = started;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Motorcicle [displacement=" + displacement + ", category=" + category + ", numberOfWheels=" 
        + numberOfWheels + ", kms=" + kms + ", started=" + started + ", brand=" + brand
        + ", model=" + model + ", price=" + price + "]";
    }
    
}
