package lists.types;

import lists.VehiclesLists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import vehicles.types.F1;


public class F1Lists implements VehiclesLists{
    List<F1> f1List = new ArrayList<F1>();

    public void setF1list(F1 f1) {
        this.f1List.add(f1);
    }

    public String orderAsc() {
        List<F1> f1ListCopy = f1List;
        String response = "";

        if (f1ListCopy.size() == 0) {
            return "0 Founds";
        }
        
        Collections.sort(f1ListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));

        for (int i = 0; i < f1ListCopy.size(); i++) {
            response += f1ListCopy.get(i).getBrand() + " " + f1ListCopy.get(i).getModel() + " " + f1ListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    } 

    public String orderDesc() {
        List<F1> f1ListCopy = f1List;
        String response = "";

        if (f1ListCopy.size() == 0) {
            return "0 Founds";
        }
        
        Collections.sort(f1ListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(f1ListCopy);

        for (int i = 0; i < f1ListCopy.size(); i++) {
            response += f1ListCopy.get(i).getBrand() + " " + f1ListCopy.get(i).getModel() + " " + f1ListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    } 

    public String limitMin(double min) {
        List<F1> f1ListCopy = new ArrayList<F1>();
        String response = "";

        for (int i = 0; i < f1List.size(); i++) {
            if (f1List.get(i).getPrice() >= min) {
                f1ListCopy.add(f1List.get(i));
            }
        }

        if (f1ListCopy.size() == 0) {
            return "0 Founds";
        }

        Collections.sort(f1ListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(f1ListCopy);

        for (int i = 0; i < f1ListCopy.size(); i++) {
            response += f1ListCopy.get(i).getBrand() + " " + f1ListCopy.get(i).getModel() + " " + f1ListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    } 
    public String limitMax(double max) {
        List<F1> f1ListCopy = new ArrayList<F1>();
        String response = "";

        for (int i = 0; i < f1List.size(); i++) {
            if (f1List.get(i).getPrice() <= max) {
                f1ListCopy.add(f1List.get(i));
            }
        }

        if (f1ListCopy.size() == 0) {
            return "0 Founds";
        }

        Collections.sort(f1ListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(f1ListCopy);

        for (int i = 0; i < f1ListCopy.size(); i++) {
            response += f1ListCopy.get(i).getBrand() + " " + f1ListCopy.get(i).getModel() + " " + f1ListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    }
    public String limitMinAndMax(double min, double max) {
        List<F1> f1ListCopy = new ArrayList<F1>();
        String response = "";

        for (int i = 0; i < f1List.size(); i++) {
            if (f1List.get(i).getPrice() >= min && f1List.get(i).getPrice() <= max) {
                f1ListCopy.add(f1List.get(i));
            }
        }

        if (f1ListCopy.size() == 0) {
            return "0 Founds";
        }

        Collections.sort(f1ListCopy, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        Collections.reverse(f1ListCopy);

        for (int i = 0; i < f1ListCopy.size(); i++) {
            response += f1ListCopy.get(i).getBrand() + " " + f1ListCopy.get(i).getModel() + " " + f1ListCopy.get(i).getPrice() + "\n";
        }

        return "Founds:\n" + response;
    }
}
