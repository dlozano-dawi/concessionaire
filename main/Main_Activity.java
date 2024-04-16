package main;

import java.util.Scanner;

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

        
        // F1Lists listOfF1 = new F1Lists();
        // Motorbikes listOfMotorbikes = new Motorbikes();
        // Motorcicle listOfMotorcicle = new Motorcicle();
        
        CarLists listOfCars = new CarLists();

        listOfCars.setCarlist(new Cars(2, "coupe", 20000, 250, false, "Lexus", "LFA", 20000));
        listOfCars.setCarlist(new Cars(2, "coupe", 80000, 300, false, "Nissan", "370z", 21000));
        listOfCars.setCarlist(new Cars(2, "coupe", 150000, 120, false, "Toyota", "Celica", 4000));
        listOfCars.setCarlist(new Cars(2, "coupe", 10000, 200, false, "Nissan", "Silvia 240sx", 25000));
        listOfCars.setCarlist(new Cars(2, "Sedan", 200000, 120, false, "Honda", "Prelude", 5000));

        Scanner sc = new Scanner(System.in);
        int option = -1; 
        
        while (option != 0) {
            System.out.println("~~~~~~~~~~~~~~~~CAR'S MENU~~~~~~~~~~~~~~~~");
            System.out.println("1. Añadir un coche");
            System.out.println("2. Mostrar lista de coches (Mayor a Menor)");
            System.out.println("3. Mostrar lista de coches (Menor a Mayor)");
            System.out.println("4. Mostrar lista de coches (Precio minimo)");
            System.out.println("5. Mostrar lista de coches (Precio Maximo)");
            System.out.println("6. Mostrar lista de coches (Precio Minimo y Maximo)");
            System.out.println("0. Exit"); 
            
            option = sc.nextInt();
            
            if (option == 1) {
                listOfCars = addCar(listOfCars, sc);
                System.out.println("Car added correctly");
            } else if (option == 2) {
                System.out.println(listOfCars.orderDesc());

            } else if (option == 3) {
                System.out.println(listOfCars.orderAsc());

            } else if (option == 4) {
                System.out.println("Introduce a min. price:");
                double min = sc.nextDouble();

                System.out.println(listOfCars.limitMin(min));

            } else if (option == 5) {
                System.out.println("Introduce a max. price:");
                double max = sc.nextDouble();
                
                System.out.println(listOfCars.limitMax(max));

            } else if (option == 6) {
                System.out.println("Introduce a max. price:");
                double min = sc.nextDouble();
                System.out.println("Introduce a min. price:");
                double max = sc.nextDouble();

                System.out.println(listOfCars.limitMinAndMax(min, max));

            } else if (option == 0) {
                break;
            }
        }
        sc.close();
    }

    public static CarLists addCar(CarLists listOfCars, Scanner sc) {
        System.out.println("Brand:");
        String brand = sc.nextLine();
        System.out.println("Model:");
        String model = sc.nextLine();
        System.out.println("Category:");
        String category = sc.nextLine();
        System.out.println("Doors:");
        int doors = sc.nextInt();
        System.out.println("Kms:");
        double kms = sc.nextDouble();
        System.out.println("Price:");
        double price = sc.nextDouble();
        System.out.println("HP:");
        double hp = sc.nextDouble();
        listOfCars.setCarlist(new Cars(doors, category, kms, hp, false, brand, model, price));
        return listOfCars;
    }
}