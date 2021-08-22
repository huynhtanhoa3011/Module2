package ProductManager;

public class Product {
    static int count = 0;
    private int id = 0;
    private String name;
    private String made;
    private double price;

    public Product() {
        id = ++count;
    }

    public Product(String name, String made, double price) {
        this.name = name;
        this.made = made;
        this.price = price;
        id = ++count;
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

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.printf("\n\t\t%-18s %-13d %-15s %-12.2f", name, id, made, price);
    }

    @Override
    public String toString() {
        return String.format("\n\t\t%-18s %-13d %-15s %-12.2f", name, id, made, price);
    }
}
