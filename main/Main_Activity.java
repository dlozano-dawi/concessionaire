package main;

import lists.types.CarLists;
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
        Cars nissanSilvia1 = new Cars(2, "coupe", 100000, 270, false, "Nissan1", "Silvia 240sx", 20000);
        Cars nissanSilvia2 = new Cars(2, "coupe", 100000, 270, false, "Nissan2", "Silvia 240sx", 21000);
        Cars nissanSilvia3 = new Cars(2, "coupe", 100000, 270, false, "Nissan3", "Silvia 240sx", 10000);
        Cars nissanSilvia4 = new Cars(2, "coupe", 100000, 270, false, "Nissan4", "Silvia 240sx", 25000);

        CarLists listtt = new CarLists(nissanSilvia1);
        listtt.setCarlist(nissanSilvia2);
        listtt.setCarlist(nissanSilvia3);
        listtt.setCarlist(nissanSilvia4);

        System.out.println(listtt.orderAsc());
        System.out.println(listtt.orderDesc());
        System.out.println(listtt.limitMin(11000));
        System.out.println(listtt.limitMax(20000));

    }
}