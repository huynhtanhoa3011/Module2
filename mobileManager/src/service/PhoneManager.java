package service;

import check.CheckInput;
import model.Phone;
import repository.ProductRepository;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneManager {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    private static int id = 0;
    static int count = 0;
    private CheckInput checkInput = new CheckInput();
    private List<Phone> phoneList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    private static ProductRepository productRepository;

    public PhoneManager() {
        productRepository = new ProductRepository();
    }

    public void addPhone() {
//        boolean check;
        do {
            Scanner sc = new Scanner(System.in);
            id = ++count;
            System.out.print("**Name telephone " + id + ":\t");
            String name = checkInput.checkString();
            System.out.print("Color: ");
            String color = checkInput.checkString();
//            System.out.print("Quantity (1 -> 10): ");
//            int quantity = checkInput.checkInteger(1, 10);
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            String yearmanufacture = inputYear();
            System.out.print("Made in: ");
            String made = checkInput.checkString();
            System.out.print("Price (1 USD/product -> 10000 USD/product): ");
            Double price = checkInput.checkDouble(1, 10000);

            Phone phone = new Phone(id, name, color, quantity, made, yearmanufacture, price);
            phoneList.add(phone);
            productRepository.saveFile(phoneList);
            System.out.print("Return MENU (selection 1) or Continue addPhone (selection #1) ?: ");
        } while (!sc.nextLine().equals("1"));
    }

    private static String inputYear() {
        System.out.print("Year Manufacture(mm/yyyy)(2001 -> 2021): ");
        String year = sc.nextLine();
        while (checkDayTime(year)) {
            System.err.print("WORONG FORMAT(mm/yyyy), please re-enter: ");
            year = sc.nextLine();
        }
        return year;
    }

    private static boolean checkDayTime(String year) {
        String regex = "(((0)[0-9])|((1)[0-2]))(\\/)((2)(0)[0-1][1-9]|((2)(0)(2)[0-1]))";
//        String regex = "([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)((2)(0)[0-1][1-9]|((2)(0)(2)[0-1]))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(year);
        return !matcher.matches();
    }

    public void editPhoneByCode() {
        System.out.print("Enter the id to edit: ");
        int codePhone = checkInput.checkInteger(1, phoneList.size());
        for (int i = 0; i < phoneList.size(); i++) {
            Phone phone = phoneList.get(i);
            if (codePhone == phone.getId()) {

                System.out.print("Name telephone: ");
                phoneList.get(i).setName(checkInput.checkString());
                System.out.print("Color: ");
                phoneList.get(i).setColor(checkInput.checkString());
                System.out.print("Quantity: ");
                phoneList.get(i).setQuantity(checkInput.checkInteger(1, 10));
                phoneList.get(i).setYearManufacture(inputYear());
                System.out.print("Made in: ");
                phoneList.get(i).setMade(checkInput.checkString());
                System.out.print("Price (USD/Product): ");
                phoneList.get(i).setPrice(checkInput.checkDouble(1, 10000));
                productRepository.saveFile(phoneList);
                break;
            }
        }
        System.out.println("\n\t\t=========================================================PHONE LIST AFTER REPAIR=======================================================");
        System.out.println("\n\t\t|Name|               | id |           |Color|              |Quantity|              |YearManufacture|           |Made|           |Spice|");
        for (Phone phone : phoneList) {
            phone.display();
        }
        System.out.println("\n\t\t======================================================================================================================================");
        System.out.println();

    }

    public void deletePhoneByCode() {
        System.out.print("Enter the id to delete: ");
        int id = checkInput.checkInteger(1, phoneList.size());
        for (Phone phone : phoneList) {
            if (phone.getId() == id) {
                phoneList.remove(phone);
                productRepository.saveFile(phoneList);
                break;
            }
        }
        System.out.println("\n\t\t======================================================PHONE LIST AFTER DELETE==========================================================");
        System.out.println("\n\t\t|Name|               | id |           |Color|              |Quantity|              |YearManufacture|           |Made|           |Spice|");
        for (Phone phone : phoneList) {
            phone.display();
        }
        System.out.println("\n\t\t=======================================================================================================================================");
        System.out.println();
    }

    public void displayPhone() {
        phoneList = productRepository.readFile();
        System.out.println("\n\t\t============================================================PHONE LIST=================================================================");
        System.out.println("\n\t\t|Name|               | id |           |Color|              |Quantity|              |YearManufacture|           |Made|           |Spice|");
        for (Phone phone : phoneList) {
            phone.display();
        }
        System.out.println("\n\t\t=======================================================================================================================================");
        System.out.println();
    }

    public void rankPhoneByPrice() {
        Collections.sort(phoneList, new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                }
                return 1;
            }
        });
        System.out.println("\n\t\t=======================================================PHONE LIST AFTER SORTING========================================================");
        System.out.println("\n\t\t|Name|               | id |           |Color|              |Quantity|              |YearManufacture|           |Made|           |Spice|");
        for (Phone phone : phoneList) {
            phone.display();
            productRepository.saveFile(phoneList);
        }
        System.out.println("\n\t\t=======================================================================================================================================");
        System.out.println();
    }

    public void editPriceByCode() {
        System.out.print("Enter the id to edit price: ");
        int code = checkInput.checkInteger(1, phoneList.size());
        for (int i = 0; i < phoneList.size(); i++) {
            if (code == phoneList.get(i).getId()) {
                System.out.print("Price: ");
                phoneList.get(i).setPrice(sc.nextDouble());
                productRepository.saveFile(phoneList);
                break;
            }
        }
        System.out.println("\n\t\t=======================================================PHONE LIST AFTER EDIT PRICE=====================================================");
        System.out.println("\n\t\t|Name|               | id |           |Color|              |Quantity|              |YearManufacture|           |Made|           |Spice|");
        for (Phone phone : phoneList) {
            phone.display();
        }
        System.out.println("\n\t\t=======================================================================================================================================");
        System.out.println();
    }

    public void findPhoneByName() {
        String name;
        System.out.print("Enter name telephone: ");
        name = sc.nextLine();
        System.out.println("\n\t\t=============================================================PHONE LIST AFTER FIND=====================================================");
        System.out.println("\n\t\t|Name|               | id |           |Color|              |Quantity|              |YearManufacture|           |Made|           |Spice|");
        for (Phone phone : phoneList) {
            if (name.equalsIgnoreCase(phone.getName())) {
                phone.display();
                productRepository.saveFile(phoneList);
                break;
            }
        }
        System.out.println("\n\t\t=======================================================================================================================================");
        System.out.println();
    }


    public static void showMenu() {
        System.out.println(ANSI_PURPLE + "\t\t\t==================MANAGER==================" + ANSI_BLUE);
        System.out.println("\t\t\t|      1. Add Phone                       |");
        System.out.println("\t\t\t|      2. Edit Phone By Id                |");
        System.out.println("\t\t\t|      3. Delete Phone By Id              |");
        System.out.println("\t\t\t|      4. Display List Phone              |");
        System.out.println("\t\t\t|      5. Rank Phone By Price             |");
        System.out.println("\t\t\t|      6. Edit Price By Id                |");
        System.out.println("\t\t\t|      7. Find Phone By Name              |");
        System.out.println("\t\t\t|      8. Exit                            |");
        System.out.println(ANSI_PURPLE + "\t\t\t===========================================" + ANSI_BLACK);
        System.out.print("\t\t\tEnter your selection: " + ANSI_BLACK);
    }


}
