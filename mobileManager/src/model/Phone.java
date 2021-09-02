package model;

public class Phone {
    static int count = 0;
    private int id = 0;
    private String name;
    private String color;
    private int quantity;
    private String made;
    private String yearManufacture;
    private double price;

    public Phone() {
        id = ++count;
    }

    public Phone(int id, String name, String color, int quantity, String made, String yearManufacture, double price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.quantity = quantity;
        this.made = made;
        this.yearManufacture = yearManufacture;
        this.price = price;
//        id = ++count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(String yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
//        System.out.printf("\n\t\t%-22s %-15d %-23s %-22s %-16s %-13.2f", name, code, color, yearmanufacture, made, price);
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("\n\t\t%-22s %-15d %-24s %-22d %-24s %-16s %-13.2f", name, id, color, quantity, yearManufacture, made, price);
    }
}
