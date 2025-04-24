package t3;

import java.util.ArrayList;
import java.util.Scanner;

public class PropertyManager {
    private ArrayList<Property> properties = new ArrayList<>();

    public void addProperty(Property p) {
        properties.add(p);
    }

    public void listProperties() {
        for (Property p : properties) {
            p.display();
        }
    }

    /**
     * NEW FEATURE: Search properties by city
     * This feature allows users to input a city name and
     * view all properties located in that city.
     */
    public void searchByCity(String city) {
        boolean found = false;
        for (Property p : properties) {
            if (p.getCity().equalsIgnoreCase(city)) {
                p.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No properties found in " + city + ".");
        }
    }
}
