package QuanLySanPhamJava;

import java.util.Scanner;

public class Product {
    private String item;
    private int id;
    private double price;

    public Product() {
    }

    public Product(String item, int id, double price) {
        this.item = item;
        this.id = id;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        item = sc.nextLine();

        System.out.print("Nhập id của sản phẩm: ");
        id = sc.nextInt();

        System.out.print("Nhập giá sản phẩm: ");
        price = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Product{" +
                "item='" + item + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    public void display() {
        System.out.printf("\n\t\t%-12s %-12s %-14s", item, id, price);
    }
}
