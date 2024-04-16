package main;

import lists.types.CarLists;
import lists.types.F1Lists;
import vehicles.types.*;
public class Main_Activity {

    public static void main(String[] args) {
        // System.out.println(nissanSilvia.getDoors());
        // System.out.println(nissanSilvia.getCategory());
        // System.out.println(nissanSilvia.getKms());
        // System.out.println(nissanSilvia.getHp());
        // System.out.println(nissanSilvia.turnOn());
        // System.out.println(nissanSilvia.isStarted());
        // System.out.println(nissanSilvia.turnOff());
        // System.out.println(nissanSilvia.getBrand());
        // System.out.println(nissanSilvia.getModel());
        // System.out.println(nissanSilvia.getPrice());

        // Cars nissanSilvia1 = new Cars(2, "coupe", 100000, 270, false, "Nissan1", "Silvia 240sx", 20000);
        // Cars nissanSilvia2 = new Cars(2, "coupe", 100000, 270, false, "Nissan2", "Silvia 240sx", 21000);
        // Cars nissanSilvia3 = new Cars(2, "coupe", 100000, 270, false, "Nissan3", "Silvia 240sx", 10000);
        // Cars nissanSilvia4 = new Cars(2, "coupe", 100000, 270, false, "Nissan4", "Silvia 240sx", 25000);

        CarLists listOfCars = new CarLists();
        F1Lists listOfF1 = new F1Lists();
        Motorbikes listOfMotorbikes = new Motorbikes();
        Motorcicle listOfMotorcicle = new Motorcicle();

        listOfCars.setCarlist(new Cars(2, "coupe", 100000, 200, false, "Nissan", "350z", 20000));
        listOfCars.setCarlist(new Cars(2, "coupe", 100000, 300, false, "Nissan", "370z", 21000));
        listOfCars.setCarlist(new Cars(2, "coupe", 100000, 120, false, "Toyota", "Celica", 10000));
        listOfCars.setCarlist(new Cars(2, "coupe", 100000, 270, false, "Nissan", "Silvia 240sx", 25000));

        System.out.println(listOfCars.orderAsc());
        System.out.println(listOfCars.orderDesc());
        System.out.println(listOfCars.limitMin(11000));
        System.out.println(listOfCars.limitMax(20000));
        System.out.println(listOfCars.limitMinAndMax(12000, 20000));
    }
}