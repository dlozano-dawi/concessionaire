package main;

import java.util.Scanner;

import lists.types.CarLists;
import lists.types.F1Lists;
import lists.types.MotorbikeLists;
import lists.types.MotorcicleLists;
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

        
        // Motorcicle listOfMotorcicle = new Motorcicle();
        
        CarLists listOfCars = new CarLists();
        F1Lists listOfF1 = new F1Lists();
        MotorbikeLists listOfMotorbikes = new MotorbikeLists();
        MotorcicleLists listOfMotorcicle = new MotorcicleLists();

        listOfCars.setCarlist(new Cars(2, "coupe", 20000, 250, false, "Lexus", "LFA", 20000));
        listOfCars.setCarlist(new Cars(2, "coupe", 80000, 300, false, "Nissan", "370z", 21000));
        listOfCars.setCarlist(new Cars(2, "coupe", 150000, 120, false, "Toyota", "Celica", 4000));
        listOfCars.setCarlist(new Cars(2, "coupe", 10000, 200, false, "Nissan", "Silvia 240sx", 25000));
        listOfCars.setCarlist(new Cars(2, "Sedan", 200000, 120, false, "Honda", "Prelude", 5000));
        
        listOfF1.setF1list(new F1(14, 2, 370, 985, false, "Aston Martin", "ARM 24", 2000000));
        listOfF1.setF1list(new F1(114, 10, 414, 1085, false, "Red Bull", "RB 24", 3500000));
        listOfF1.setF1list(new F1(2, 0, 412, 1034, false, "McLaren", "MC24", 2500000));
        listOfF1.setF1list(new F1(239, 32, 415, 1134, false, "Ferrari", "F24", 4000000));
        listOfF1.setF1list(new F1(183, 26, 390, 1034, false, "Mercedes", "M24", 3900000));
        
        listOfMotorbikes.setMotorbikeslist(new Motorbikes(150.0, "Scooter", 3, 30000, false, "Yamaha", "35YZ", 1500, 30));
        listOfMotorbikes.setMotorbikeslist(new Motorbikes(250.0, "Scooter", 2, 45000, false, "BMW", "M505", 2500, 50));
        listOfMotorbikes.setMotorbikeslist(new Motorbikes(350.0, "GP", 2, 15000, false, "BMW", "M705", 5500, 100));
        
        listOfMotorcicle.setMotorciclelist(new Motorcicle(100.0, "Scooter", 2, 15000, false, "BMW", "M15", 1000));
        listOfMotorcicle.setMotorciclelist(new Motorcicle(80.0, "Scooter", 3, 15000, false, "BMW", "M55", 700));
        listOfMotorcicle.setMotorciclelist(new Motorcicle(30.0, "Scooter", 2, 15000, false, "BMW", "M25", 400));
        
        Scanner sc = new Scanner(System.in);
        int option = -1; 
        
        while (option != 0) {
            System.out.println("~~~~~~~MAIN MENU~~~~~~~");
            System.out.println("1. Cars Menu");
            System.out.println("2. F1 Menu");
            System.out.println("3. Motorbike Menu");
            System.out.println("4. Motorcicle Menu");
            System.out.println("0. Exit");

            option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                listOfCars = showCarMenu(listOfCars, sc);
            } else if (option == 2) {
                listOfF1 = showF1Menu(listOfF1, sc);
            } else if (option == 3) {
                listOfMotorbikes = showMotorbikeMenu(listOfMotorbikes, sc);
            } else if (option == 4) {
                listOfMotorcicle = showMotorcicleMenu(listOfMotorcicle, sc);
            } else if (option == 0) {
                break;
            }
        }
        sc.close();
    }

    public static MotorbikeLists showMotorbikeMenu(MotorbikeLists listOfMotorbike, Scanner sc){
        int option = -1; 
        
        while (option != 0) {
            System.out.println("~~~~~~~~~~~~~~~~MOTORBIKE'S MENU~~~~~~~~~~~~~~~~");
            System.out.println("1. Add a Motorbike");
            System.out.println("2. Show list of Motorbike (Max to Min)");
            System.out.println("3. Show list of Motorbike (Min to Max)");
            System.out.println("4. Show list of Motorbike (Min price)");
            System.out.println("5. Show list of Motorbike (Max price)");
            System.out.println("6. Show list of Motorbike (Min and Max price)");
            System.out.println("0. Exit"); 
            
            option = sc.nextInt();
            sc.nextLine();
            
            if (option == 1) {
                listOfMotorbike = addMotorbike(listOfMotorbike, sc);
                System.out.println("Motorbike added correctly");
            } else if (option == 2) {
                System.out.println(listOfMotorbike.orderDesc());

            } else if (option == 3) {
                System.out.println(listOfMotorbike.orderAsc());

            } else if (option == 4) {
                System.out.println("Introduce a min. price:");
                double min = sc.nextDouble();

                System.out.println(listOfMotorbike.limitMin(min));

            } else if (option == 5) {
                System.out.println("Introduce a max. price:");
                double max = sc.nextDouble();
                
                System.out.println(listOfMotorbike.limitMax(max));

            } else if (option == 6) {
                System.out.println("Introduce a min. price:");
                double min = sc.nextDouble();
                System.out.println("Introduce a max. price:");
                double max = sc.nextDouble();

                System.out.println(listOfMotorbike.limitMinAndMax(min, max));

            } else if (option == 0) {
                break;
            }
        }
        return listOfMotorbike;
    }
    public static MotorbikeLists addMotorbike(MotorbikeLists listOfMotorbike, Scanner sc) {
        System.out.println("Brand:");
        String brand = sc.nextLine();
        System.out.println("Model:");
        String model = sc.nextLine();
        System.out.println("Displacament:");
        double displacament = sc.nextDouble();
        System.out.println("Category:");
        String category = sc.nextLine();
        System.out.println("Number Of Wheels:");
        int numberOfWheels = sc.nextInt();
        System.out.println("KMs:");
        double kms = sc.nextDouble();
        System.out.println("Price:");
        double price = sc.nextDouble();
        System.out.println("HP:");
        double hp = sc.nextDouble();
        listOfMotorbike.setMotorbikeslist(new Motorbikes(displacament, category, numberOfWheels, kms, false, brand, model, price, hp));
        return listOfMotorbike;
    }

    public static MotorcicleLists showMotorcicleMenu(MotorcicleLists listOfMotorcicle, Scanner sc){
        int option = -1; 
        
        while (option != 0) {
            System.out.println("~~~~~~~~~~~~~~~~MOTORCICLE'S MENU~~~~~~~~~~~~~~~~");
            System.out.println("1. Add a Motorcicle");
            System.out.println("2. Show list of Motorcicle (Max to Min)");
            System.out.println("3. Show list of Motorcicle (Min to Max)");
            System.out.println("4. Show list of Motorcicle (Min price)");
            System.out.println("5. Show list of Motorcicle (Max price)");
            System.out.println("6. Show list of Motorcicle (Min and Max price)");
            System.out.println("0. Exit"); 
            
            option = sc.nextInt();
            sc.nextLine();
            
            if (option == 1) {
                listOfMotorcicle = addMotorcicle(listOfMotorcicle, sc);
                System.out.println("Motorcicle added correctly");
            } else if (option == 2) {
                System.out.println(listOfMotorcicle.orderDesc());

            } else if (option == 3) {
                System.out.println(listOfMotorcicle.orderAsc());

            } else if (option == 4) {
                System.out.println("Introduce a min. price:");
                double min = sc.nextDouble();

                System.out.println(listOfMotorcicle.limitMin(min));

            } else if (option == 5) {
                System.out.println("Introduce a max. price:");
                double max = sc.nextDouble();
                
                System.out.println(listOfMotorcicle.limitMax(max));

            } else if (option == 6) {
                System.out.println("Introduce a min. price:");
                double min = sc.nextDouble();
                System.out.println("Introduce a max. price:");
                double max = sc.nextDouble();

                System.out.println(listOfMotorcicle.limitMinAndMax(min, max));

            } else if (option == 0) {
                break;
            }
        }
        return listOfMotorcicle;
    }
    public static MotorcicleLists addMotorcicle(MotorcicleLists listOfMotorcicle, Scanner sc) {
        System.out.println("Brand:");
        String brand = sc.nextLine();
        System.out.println("Model:");
        String model = sc.nextLine();
        System.out.println("Displacament:");
        double displacament = sc.nextDouble();
        System.out.println("Category:");
        String category = sc.nextLine();
        System.out.println("Number Of Wheels:");
        int numberOfWheels = sc.nextInt();
        System.out.println("KMs:");
        double kms = sc.nextDouble();
        System.out.println("Price:");
        double price = sc.nextDouble();
        listOfMotorcicle.setMotorciclelist(new Motorcicle(displacament, category, numberOfWheels, kms, false, brand, model, price));
        return listOfMotorcicle;
    }

    public static F1Lists showF1Menu(F1Lists listOfF1, Scanner sc){
        int option = -1; 
        
        while (option != 0) {
            System.out.println("~~~~~~~~~~~~~~~~F1'S MENU~~~~~~~~~~~~~~~~");
            System.out.println("1. Add a F1");
            System.out.println("2. Show list of F1 (Max to Min)");
            System.out.println("3. Show list of F1 (Min to Max)");
            System.out.println("4. Show list of F1 (Min price)");
            System.out.println("5. Show list of F1 (Max price)");
            System.out.println("6. Show list of F1 (Min and Max price)");
            System.out.println("0. Exit"); 
            
            option = sc.nextInt();
            sc.nextLine();
            
            if (option == 1) {
                listOfF1 = addF1(listOfF1, sc);
                System.out.println("F1 added correctly");
            } else if (option == 2) {
                System.out.println(listOfF1.orderDesc());

            } else if (option == 3) {
                System.out.println(listOfF1.orderAsc());

            } else if (option == 4) {
                System.out.println("Introduce a min. price:");
                double min = sc.nextDouble();

                System.out.println(listOfF1.limitMin(min));

            } else if (option == 5) {
                System.out.println("Introduce a max. price:");
                double max = sc.nextDouble();
                
                System.out.println(listOfF1.limitMax(max));

            } else if (option == 6) {
                System.out.println("Introduce a max. price:");
                double min = sc.nextDouble();
                System.out.println("Introduce a min. price:");
                double max = sc.nextDouble();

                System.out.println(listOfF1.limitMinAndMax(min, max));

            } else if (option == 0) {
                break;
            }
        }
        return listOfF1;
    }
    public static F1Lists addF1(F1Lists listOfF1, Scanner sc) {

        System.out.println("Brand:");
        String brand = sc.nextLine();
        System.out.println("Model:");
        String model = sc.nextLine();
        System.out.println("Races Winned:");
        int racesWinned = sc.nextInt();
        System.out.println("Championships Winned:");
        int championshipsWinned = sc.nextInt();
        System.out.println("Top Speed:");
        double topSpeed = sc.nextDouble();
        System.out.println("Price:");
        double price = sc.nextDouble();
        System.out.println("HP:");
        double hp = sc.nextDouble();
        listOfF1.setF1list(new F1(racesWinned, championshipsWinned, topSpeed, hp, false, brand, model, price));
        return listOfF1;
    }

    public static CarLists showCarMenu(CarLists listOfCars, Scanner sc){
        int option = -1; 
        
        while (option != 0) {
            System.out.println("~~~~~~~~~~~~~~~~CAR'S MENU~~~~~~~~~~~~~~~~");
            System.out.println("1. Add a Car");
            System.out.println("2. Show list of Cars (Max to Min)");
            System.out.println("3. Show list of Cars (Min to Max)");
            System.out.println("4. Show list of Cars (Min price)");
            System.out.println("5. Show list of Cars (Max price)");
            System.out.println("6. Show list of Cars (Min and Max price)");
            System.out.println("0. Exit"); 
            
            option = sc.nextInt();
            sc.nextLine();
            
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
        return listOfCars;
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