package main;

import vehicles.types.*;
public class Main_Activity {

    public static void main(String[] args) {
        Cars nissanSilvia = new Cars(2, "coupe", 100000, 270, false, "Nissan", "Silvia 240sx", 20000);

        System.out.println(nissanSilvia.getDoors());
        System.out.println(nissanSilvia.getCategory());
        System.out.println(nissanSilvia.getKms());
        System.out.println(nissanSilvia.getHp());
        System.out.println(nissanSilvia.turnOn());
        System.out.println(nissanSilvia.isStarted());
        System.out.println(nissanSilvia.turnOff());
        System.out.println(nissanSilvia.getBrand());
        System.out.println(nissanSilvia.getModel());
        System.out.println(nissanSilvia.getPrice());
    }
}