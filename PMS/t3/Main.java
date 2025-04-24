package t3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PropertyManager manager = new PropertyManager();

        manager.addProperty(new Property("123 Main St", "Tbilisi", 120000, "Apartment"));
        manager.addProperty(new Property("456 Liberty Ave", "Batumi", 150000, "House"));
        manager.addProperty(new Property("789 Rustaveli", "Tbilisi", 99000, "Studio"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("All Properties:");
        manager.listProperties();

        System.out.print("\nEnter a city to search: ");
        String city = scanner.nextLine();
        manager.searchByCity(city);
    }
}
