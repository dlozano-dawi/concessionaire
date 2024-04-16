package lists.types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lists.VehiclesLists;
import vehicles.types.Cars;

public class CarLists implements VehiclesLists{
    List<Cars> carList = new ArrayList<Cars>();

    // public CarLists(Cars car) {
    //     this.carList.add(car);
    // }

    public void setCarlist(Cars car) {
        this.carList.add(car);
    }
    
    public String orderAsc() {
        List<Cars> carListCopy = carList;
        String response = "";

        if (carListCopy.size() == 0) {
            return "0 Founds";
        }
        
        Collections.sort(carListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));

        for (int i = 0; i < carListCopy.size(); i++) {
            response += carListCopy.get(i).getBrand() + " " + carListCopy.get(i).getModel() + " " + carListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    } 

    public String orderDesc() {
        List<Cars> carListCopy = carList;
        String response = "";

        if (carListCopy.size() == 0) {
            return "0 Founds";
        }
        
        Collections.sort(carListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(carListCopy);

        for (int i = 0; i < carListCopy.size(); i++) {
            response += carListCopy.get(i).getBrand() + " " + carListCopy.get(i).getModel() + " " + carListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    } 

    public String limitMin(double min) {
        List<Cars> carListCopy = new ArrayList<Cars>();
        String response = "";

        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getPrice() >= min) {
                carListCopy.add(carList.get(i));
            }
        }

        if (carListCopy.size() == 0) {
            return "0 Founds";
        }

        Collections.sort(carListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(carListCopy);

        for (int i = 0; i < carListCopy.size(); i++) {
            response += carListCopy.get(i).getBrand() + " " + carListCopy.get(i).getModel() + " " + carListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    } 
    public String limitMax(double max) {
        List<Cars> carListCopy = new ArrayList<Cars>();
        String response = "";

        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getPrice() <= max) {
                carListCopy.add(carList.get(i));
            }
        }

        if (carListCopy.size() == 0) {
            return "0 Founds";
        }

        Collections.sort(carListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(carListCopy);

        for (int i = 0; i < carListCopy.size(); i++) {
            response += carListCopy.get(i).getBrand() + " " + carListCopy.get(i).getModel() + " " + carListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    }
    public String limitMinAndMax(double min, double max) {
        List<Cars> carListCopy = new ArrayList<Cars>();
        String response = "";

        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getPrice() >= min && carList.get(i).getPrice() <= max) {
                carListCopy.add(carList.get(i));
            }
        }

        if (carListCopy.size() == 0) {
            return "0 Founds";
        }

        Collections.sort(carListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(carListCopy);

        for (int i = 0; i < carListCopy.size(); i++) {
            response += carListCopy.get(i).getBrand() + " " + carListCopy.get(i).getModel() + " " + carListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    }
}
