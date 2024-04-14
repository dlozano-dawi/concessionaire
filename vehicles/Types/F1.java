package vehicles.types;

import vehicles.CarsAbstractClass;

public class F1 extends CarsAbstractClass{
    int racesWinned;
    int championshipsWinned;
    double topSpeed;
    
    public F1(int racesWinned, int championshipsWinned, double topSpeed, double hp, boolean started, String brand, String model, double price) {
        this.racesWinned = racesWinned;
        this.championshipsWinned = championshipsWinned;
        this.topSpeed = topSpeed;
        super.hp = hp;
        super.started = started;
        super.brand = brand;
        super.model = model;
        super.price = price;
    }
    
    public int getRacesWined() {
        return racesWinned;
    }
    public void setRacesWined(int racesWined) {
        this.racesWinned = racesWined;
    }
    public int getChampionshipsWinned() {
        return championshipsWinned;
    }
    public void setChampionshipsWinned(int championshipsWinned) {
        this.championshipsWinned = championshipsWinned;
    }
    public double getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    
}
