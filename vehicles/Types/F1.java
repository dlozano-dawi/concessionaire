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
        this.hp = hp;
        this.started = started;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Model: " + this.model + ", Price: " + this.price + ", HP: " + this.hp + ", ChampionshipsWinned: " + this.championshipsWinned + ", RacesWinned: " + this.racesWinned + ", Started: " + this.started + ", TopSpeed: " + this.topSpeed;
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
