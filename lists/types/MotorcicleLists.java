package lists.types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lists.VehiclesLists;
import vehicles.types.Motorcicle;

public class MotorcicleLists implements VehiclesLists{
    List<Motorcicle> motorcicleList = new ArrayList<Motorcicle>();

    public void setMotorciclelist(Motorcicle motorcicle) {
        this.motorcicleList.add(motorcicle);
    }
    
    public String orderAsc() {
        List<Motorcicle> motorcicleListCopy = motorcicleList;
        String response = "";

        if (motorcicleListCopy.size() == 0) {
            return "0 Founds";
        }
        
        Collections.sort(motorcicleListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));

        for (int i = 0; i < motorcicleListCopy.size(); i++) {
            response += motorcicleListCopy.get(i).getBrand() + " " + motorcicleListCopy.get(i).getModel() + " " + motorcicleListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    } 

    public String orderDesc() {
        List<Motorcicle> motorcicleListCopy = motorcicleList;
        String response = "";

        if (motorcicleListCopy.size() == 0) {
            return "0 Founds";
        }
        
        Collections.sort(motorcicleListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(motorcicleListCopy);

        for (int i = 0; i < motorcicleListCopy.size(); i++) {
            response += motorcicleListCopy.get(i).getBrand() + " " + motorcicleListCopy.get(i).getModel() + " " + motorcicleListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    } 

    public String limitMin(double min) {
        List<Motorcicle> motorcicleListCopy = new ArrayList<Motorcicle>();
        String response = "";

        for (int i = 0; i < motorcicleList.size(); i++) {
            if (motorcicleList.get(i).getPrice() >= min) {
                motorcicleListCopy.add(motorcicleList.get(i));
            }
        }

        if (motorcicleListCopy.size() == 0) {
            return "0 Founds";
        }

        Collections.sort(motorcicleListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(motorcicleListCopy);

        for (int i = 0; i < motorcicleListCopy.size(); i++) {
            response += motorcicleListCopy.get(i).getBrand() + " " + motorcicleListCopy.get(i).getModel() + " " + motorcicleListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    } 
    public String limitMax(double max) {
        List<Motorcicle> motorcicleListCopy = new ArrayList<Motorcicle>();
        String response = "";

        for (int i = 0; i < motorcicleList.size(); i++) {
            if (motorcicleList.get(i).getPrice() <= max) {
                motorcicleListCopy.add(motorcicleList.get(i));
            }
        }

        if (motorcicleListCopy.size() == 0) {
            return "0 Founds";
        }

        Collections.sort(motorcicleListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(motorcicleListCopy);

        for (int i = 0; i < motorcicleListCopy.size(); i++) {
            response += motorcicleListCopy.get(i).getBrand() + " " + motorcicleListCopy.get(i).getModel() + " " + motorcicleListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    }
    public String limitMinAndMax(double min, double max) {
        List<Motorcicle> motorcicleListCopy = new ArrayList<Motorcicle>();
        String response = "";

        for (int i = 0; i < motorcicleList.size(); i++) {
            if (motorcicleList.get(i).getPrice() >= min && motorcicleList.get(i).getPrice() <= max) {
                motorcicleListCopy.add(motorcicleList.get(i));
            }
        }

        if (motorcicleListCopy.size() == 0) {
            return "0 Founds";
        }

        Collections.sort(motorcicleListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(motorcicleListCopy);

        for (int i = 0; i < motorcicleListCopy.size(); i++) {
            response += motorcicleListCopy.get(i).getBrand() + " " + motorcicleListCopy.get(i).getModel() + " " + motorcicleListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    }
}