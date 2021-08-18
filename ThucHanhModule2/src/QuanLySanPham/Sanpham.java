package QuanLySanPham;

import java.util.Scanner;

public class Sanpham {
    private String name;
    private int id;
    private double price;

    public Sanpham() {
    }

    public Sanpham(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void input () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        name = sc.nextLine();

        System.out.print("Nhập id của sản phẩm: ");
        id = sc.nextInt();

        System.out.print("Nhập giá của sản phẩm: ");
        price = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Sanpham{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    public void display() {
        System.out.printf("\n\t\t%-20s %-10.3f %-10.3f", name, id, price);
    }
}
