package service;

import model.Bill;
import model.Phone;
import repository.ProductRepository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BuyerService {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    private static int id = 0;
    static int count = 0;
    private CheckInput checkInput = new CheckInput();
    private List<Bill> productList = new ArrayList<Bill>();
    static Scanner sc = new Scanner(System.in);
    private ProductRepository productRepository;

    public void addCustomerName() {
        boolean check;
        do {
//            System.out.print("Enter customer number(1 -> 20): ");
//            int n = checkInput.checkInteger(1, 20);
            Scanner sc = new Scanner(System.in);
//            id = ++count;
//            System.out.print("customerName " + id + ":\t");
            System.out.print("customerName: ");
            String customer = checkInput.checkString();
            System.out.print("numberPhone: ");
            int phoneNumber = checkInput.checkInteger(1, 1000000000);
            System.out.print("product: ");
            String product = checkInput.checkString();
            System.out.print("quantity: ");
            int quantity = checkInput.checkInteger(1, 10);
            System.out.print("price: ");
            Double price = checkInput.checkDouble(1, 10000);
            productList.add( new Bill(customer, phoneNumber, product, quantity, price));
//            productList.add(bill);
//            ProductRepository.saveFile(productList);
            System.out.print("Return to Payment (selection 1) or keep buying (selection #1) ?: ");
            if (sc.nextLine().equals("1")) {
                check = true;
            } else {
                check = false;
            }
        } while (!check);
    }

    public void editCustomerName() {
        System.out.print("Enter the customer to edit: ");
        String customer = checkInput.checkString();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCustomerName().equals(customer)) {

                System.out.print("customerName: ");
                productList.get(i).setCustomerName(checkInput.checkString());
                System.out.print("numberPhone: ");
                productList.get(i).setNumberPhone(checkInput.checkInteger(1, 1000000000));
                System.out.print("product: ");
                productList.get(i).setProduct(checkInput.checkString());
                System.out.print("quantity: ");
                productList.get(i).setQuantity(checkInput.checkInteger(1, 10));
                System.out.print("price: ");
                productList.get(i).setPrice(checkInput.checkDouble(1, 10000));
                break;
            }
        }
        System.out.println("\n\t\t================================================BILL=======================================================");
        System.out.println("\n\t\t|customerName|               |numberPhone|           |product|              |quantity|              |price|");
        for (Bill bill : productList) {
            bill.display();
        }
        System.out.println("\n\t\t============================================================================================================");
        System.out.println();
    }

    public void deleteCustomerName() {
        System.out.print("Enter the customer to delete: ");
        String customer = checkInput.checkString();
        for(int i = 0 ; i < productList.size(); i ++){
            if(productList.get(i).getCustomerName().equals(customer)) {
                productList.remove(i);
                break;
            }else {
                System.out.println(customer + " not avaiable");
                break;
            }
        }
        System.out.println("\n\t\t=================================================BILL======================================================");
        System.out.println("\n\t\t|customerName|               |numberPhone|           |product|              |quantity|              |price|");
        for (Bill bill : productList) {
            bill.display();
        }
        System.out.println("\n\t\t============================================================================================================");
        System.out.println();
    }

    public void displayCustomer() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

//        productList  = productRepository.readFile();
        System.out.println("\n\t\t=================================================BILL======================================================");
        System.out.println("\n\t\t|customerName|               |numberPhone|           |product|              |quantity|              |price|");
        for (Bill bill : productList) {
            bill.display();
        }
        System.out.println("\n\t\t============================================================================================================");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDate: " + ft.format(date));
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t...SEE YOU AGAIN...");
        System.out.println();
    }

    public static void showProduct() {
        System.out.println(ANSI_PURPLE + "\t\t\t===================CUSTOMER================" + ANSI_BLUE);
        System.out.println("\t\t\t|      1. Purchase                        |");
        System.out.println("\t\t\t|      2. Edit Order                      |");
        System.out.println("\t\t\t|      3. Delete Order                    |");
        System.out.println("\t\t\t|      4. Pay                             |");
        System.out.println("\t\t\t|      5. Exit                            |");
        System.out.println(ANSI_PURPLE + "\t\t\t===========================================" + ANSI_BLACK);
        System.out.print("Enter your selection(1 -> 5): " + ANSI_BLACK);
    }
}
