package t3;

public class Property {
    private String address;
    private String city;
    private double price;
    private String type;

    public Property(String address, String city, double price, String type) {
        this.address = address;
        this.city = city;
        this.price = price;
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void display() {
        System.out.println(type + " in " + city + " at " + address + " — $" + price);
    }
}
