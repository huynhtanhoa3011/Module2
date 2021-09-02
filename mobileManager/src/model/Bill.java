package model;

public class Bill {
//    public java.lang.System System;
    private String customerName;
    private int numberPhone;
    private String product;
    private int quantity;
    private Double price;

    public Bill() {
    }
    
    public Bill(String customerName, int numberPhone, String product, int quantity, Double price) {
        this.customerName = customerName;
        this.numberPhone = numberPhone;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

//    public Bill(String customer, int phoneNumber) {
//    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("\n\t\t%-30s %-22d %-24s %-20d %-15.2f", customerName, numberPhone, product, quantity, price);
    }

}
