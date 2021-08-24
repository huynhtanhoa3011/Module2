package model;

public class Phone {
    static int count = 0;
    private int code = 0;
    private String name;
    private String color;
    private String made;
    private String yearmanufacture;
    private double price;

    public Phone() {
        code = ++count;
    }

    public Phone(String name, String color, String made, String yearmanufacture, double price) {
        this.name = name;
        this.color = color;
        this.made = made;
        this.yearmanufacture = yearmanufacture;
        this.price = price;
        code = ++count;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getYearmanufacture() {
        return yearmanufacture;
    }

    public void setYearmanufacture(String yearmanufacture) {
        this.yearmanufacture = yearmanufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.printf("\n\t\t%-22s %-15d %-23s %-22s %-16s %-13.2f", name, code, color, yearmanufacture, made, price);
    }

    @Override
    public String toString() {
        return String.format("\n\t\t%-22s %-15d %-18s %-13s %-18s %-13.2f", name, code, color, yearmanufacture, made, price);
    }
}
