package service;

import model.Phone;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneManager {
    private static int code = 0;
    static int count = 0;
    static CheckInput checkInput = new CheckInput();
    static List<Phone> phoneList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addPhone() {
        System.out.print("Enter the quantity to be added(1 -> 20): ");
        int n = checkInput.checkInteger(1, 20);
        for (int i = 0; i < n; i++) {
            code = ++count;
            System.out.print("**Name telephone " + code + ":\t");
            String name = checkInput.checkString();
            System.out.print("Color: ");
            String color = checkInput.checkString();
            String yearmanufacture = inputYear();
            System.out.print("Made in: ");
            String made = checkInput.checkString();
            System.out.print("Price (1 USD -> 10000 USD): ");
            Double price = checkInput.checkDouble(1, 10000);

            Phone phone = new Phone(name, color, made, yearmanufacture, price);
            phoneList.add(phone);
        }
    }

    private static String inputYear() {
        System.out.print("Year Manufacture(dd/mm/yy)(2001 -> 2021): ");
        String year = sc.nextLine();
        while (checkDayTime(year)) {
            System.err.println("does not exist!!!");
            System.out.println("Year Manufacture: ");
            year = sc.nextLine();
        }
        return year;
    }

    private static boolean checkDayTime(String year) {
        String regex = "([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)((2)(0)[0-1][1-9]|((2)(0)(2)[0-1]))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(year);
        return !matcher.matches();
    }

    public static void editPhoneByCode() {
        System.out.print("Enter the code to edit: ");
        int codePhone = checkInput.checkInteger(1, phoneList.size());
        for (int i = 0; i < phoneList.size(); i++) {
            if (codePhone == phoneList.get(i).getCode()) {

                System.out.print("Name telephone: ");
                phoneList.get(i).setName(checkInput.checkString());
                System.out.print("Color: ");
                phoneList.get(i).setColor(checkInput.checkString());
                phoneList.get(i).setYearmanufacture(inputYear());
                System.out.print("Made in: ");
                phoneList.get(i).setMade(checkInput.checkString());
                System.out.print("Price (USD): ");
                phoneList.get(i).setPrice(checkInput.checkDouble(1, 10000));
                break;
            }
        }
        System.out.println("\n\t\t===========================================PHONE LIST AFTER REPAIR==========================================");
        System.out.println("\n\t\tName                  Code             Color              YearManufacture             Made             Spice");
        for (Phone phone : phoneList) {
            phone.display();
        }
        System.out.println("\n\t\t==============================================================================================================");
        System.out.println();
    }

    public static void deletePhoneByCode() {
        System.out.print("Enter the code to delete: ");
        int code = checkInput.checkInteger(1, phoneList.size());
        for (Phone phone : phoneList) {
            if (phone.getCode() == code) {
                phoneList.remove(phone);
                break;
            }
        }
        System.out.println("\n\t\t===========================================PHONE LIST AFTER DELETE===========================================");
        System.out.println("\n\t\tName                  Code             Color              YearManufacture             Made             Spice");
        for (Phone phone : phoneList) {
            phone.display();
        }
        System.out.println("\n\t\t==============================================================================================================");
        System.out.println();
    }

    public static void displayPhone() {
        System.out.println("\n\t\t==================================================PHONE LIST=================================================");
        System.out.println("\n\t\tName                  Code             Color              YearManufacture             Made             Spice");
        for (Phone phone : phoneList) {
            phone.display();
        }
        System.out.println("\n\t\t==============================================================================================================");
        System.out.println();
    }

    public static void rankPhoneByPrice() {
        Collections.sort(phoneList, new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                }
                return 1;
            }
        });
        System.out.println("\n\t\t=========================================PHONE LIST AFTER SORTING===========================================");
        System.out.println("\n\t\tName                  Code             Color              YearManufacture             Made             Spice");
        for (Phone phone : phoneList) {
            phone.display();
        }
        System.out.println("\n\t\t==============================================================================================================");
        System.out.println();
    }

    public static void editPriceByCode() {
        System.out.print("Enter the code to edit price: ");
        int code = checkInput.checkInteger(1, phoneList.size());
        for (int i = 0; i < phoneList.size(); i++) {
            if (code == phoneList.get(i).getCode()) {
                System.out.print("Price: ");
                phoneList.get(i).setPrice(sc.nextDouble());
                break;
            }
        }
        System.out.println("\n\t\t========================================PHONE LIST AFTER EDIT PRICE=========================================");
        System.out.println("\n\t\tName                  Code             Color              YearManufacture             Made             Spice");
        for (Phone phone : phoneList) {
            phone.display();
        }
        System.out.println("\n\t\t==============================================================================================================");
        System.out.println();
    }

    public static void findPhoneByName() {
        String name;
        System.out.print("Enter name telephone: ");
        name = sc.nextLine();
        System.out.println("\n\t\t==========================================PHONE LIST AFTER FIND=============================================");
        System.out.println("\n\t\tName                  Code             Color              YearManufacture             Made             Spice");
        for (Phone phone : phoneList) {
            if (name.equalsIgnoreCase(phone.getName())) {
                phone.display();
                System.out.println("\n\t\t==============================================================================================================");
                System.out.println();
                break;
            }
        }
    }

    public static void saveFile() {
        try {
            File file = new File("src\\data\\phones.csv");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Phone phone : phoneList) {
                bw.write(phone.getName() +
                        ",   " + phone.getCode() +
                        ",   " + phone.getColor() +
                        ",   " + phone.getYearmanufacture() +
                        ",   " + phone.getMade() +
                        ",   " + phone.getPrice() + "\n");
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Phone> readFile() {
        List<Phone> tempList = new ArrayList<>();

        try {
            File file = new File("src\\data\\phones.csv");
            if (!file.exists()) {
                saveFile();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            String splitBy = ",   ";



            while ((line = br.readLine()) != null) {
                String[] phone = line.split(splitBy);
                Phone phone1 = new Phone();
                phone1.setName(phone[0]);
                phone1.setCode(Integer.parseInt(phone[1]));
                phone1.setColor(phone[2]);
                phone1.setYearmanufacture(phone[3]);
                phone1.setMade(phone[4]);
                phone1.setPrice(Double.parseDouble(phone[5]));
                tempList.add(phone1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (tempList.size() > 0) {
            phoneList = tempList;
        }

        return phoneList;
    }

    public static void showMenu() {
        System.out.println("\t\t\t=====================MENU==================");
        System.out.println("\t\t\t|      1. Add_Phone                       |");
        System.out.println("\t\t\t|      2. Edit_Phone_By_Code              |");
        System.out.println("\t\t\t|      3. Delete_Phone_By_Code            |");
        System.out.println("\t\t\t|      4. Display_Phone                   |");
        System.out.println("\t\t\t|      5. Rank_Phone_By_Price             |");
        System.out.println("\t\t\t|      6. Edit_Price_By_Code              |");
        System.out.println("\t\t\t|      7. Find_Phone_By_Name              |");
        System.out.println("\t\t\t|      8. Save_File                       |");
        System.out.println("\t\t\t|      9. Read_File                       |");
        System.out.println("\t\t\t|      10. Exit                           |");
        System.out.println("\t\t\t===========================================");
        System.out.print("Enter your selection(1 -> 10): ");
    }
}
