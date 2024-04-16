package lists.types;

import lists.VehiclesLists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vehicles.types.Motorbikes;


public class MotorbikeLists implements VehiclesLists{
    List<Motorbikes> motorbikesList = new ArrayList<Motorbikes>();

    public void setmotorbikeslist(Motorbikes motorbikes) {
        this.motorbikesList.add(motorbikes);
    }
    
    public String orderAsc() {
        List<Motorbikes> motorbikesListCopy = motorbikesList;
        String response = "";

        if (motorbikesListCopy.size() == 0) {
            return "0 Founds";
        }
        
        Collections.sort(motorbikesListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));

        for (int i = 0; i < motorbikesListCopy.size(); i++) {
            response += motorbikesListCopy.get(i).getBrand() + " " + motorbikesListCopy.get(i).getModel() + " " + motorbikesListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    } 

    public String orderDesc() {
        List<Motorbikes> motorbikesListCopy = motorbikesList;
        String response = "";

        if (motorbikesListCopy.size() == 0) {
            return "0 Founds";
        }
        
        Collections.sort(motorbikesListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(motorbikesListCopy);

        for (int i = 0; i < motorbikesListCopy.size(); i++) {
            response += motorbikesListCopy.get(i).getBrand() + " " + motorbikesListCopy.get(i).getModel() + " " + motorbikesListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    } 

    public String limitMin(double min) {
        List<Motorbikes> motorbikesListCopy = new ArrayList<Motorbikes>();
        String response = "";

        for (int i = 0; i < motorbikesList.size(); i++) {
            if (motorbikesList.get(i).getPrice() >= min) {
                motorbikesListCopy.add(motorbikesList.get(i));
            }
        }

        if (motorbikesListCopy.size() == 0) {
            return "0 Founds";
        }

        Collections.sort(motorbikesListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(motorbikesListCopy);

        for (int i = 0; i < motorbikesListCopy.size(); i++) {
            response += motorbikesListCopy.get(i).getBrand() + " " + motorbikesListCopy.get(i).getModel() + " " + motorbikesListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    } 
    public String limitMax(double max) {
        List<Motorbikes> motorbikesListCopy = new ArrayList<Motorbikes>();
        String response = "";

        for (int i = 0; i < motorbikesList.size(); i++) {
            if (motorbikesList.get(i).getPrice() <= max) {
                motorbikesListCopy.add(motorbikesList.get(i));
            }
        }

        if (motorbikesListCopy.size() == 0) {
            return "0 Founds";
        }

        Collections.sort(motorbikesListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(motorbikesListCopy);

        for (int i = 0; i < motorbikesListCopy.size(); i++) {
            response += motorbikesListCopy.get(i).getBrand() + " " + motorbikesListCopy.get(i).getModel() + " " + motorbikesListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    }
    public String limitMinAndMax(double min, double max) {
        List<Motorbikes> motorbikesListCopy = new ArrayList<Motorbikes>();
        String response = "";

        for (int i = 0; i < motorbikesList.size(); i++) {
            if (motorbikesList.get(i).getPrice() >= min && motorbikesList.get(i).getPrice() <= max) {
                motorbikesListCopy.add(motorbikesList.get(i));
            }
        }

        if (motorbikesListCopy.size() == 0) {
            return "0 Founds";
        }

        Collections.sort(motorbikesListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(motorbikesListCopy);

        for (int i = 0; i < motorbikesListCopy.size(); i++) {
            response += motorbikesListCopy.get(i).getBrand() + " " + motorbikesListCopy.get(i).getModel() + " " + motorbikesListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    }
}