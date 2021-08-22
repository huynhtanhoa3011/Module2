package MobileManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class PhoneManager {
    private static int code = 0;
    static int count = 0;
    static CheckInput checkInput = new CheckInput();
    static List<Phone> phoneList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	int choose;
	do {
	    showMenu();
	    choose = checkInput.checkInteger(1, 10);

	    switch (choose) {
            case 1:
                addPhone();
                break;
            case 2:
                editPhoneByCode();
                break;
            case 3:
                deletePhoneByCode();
                break;
            case 4:
                displayPhone();
                break;
            case 5:
                rankPhoneByPrice();
                break;
            case 6:
                editPriceByCode();
                break;
            case 7:
                findPhoneByName();
                break;
            case 8:
                saveFile(phoneList);
                break;
            case 9:
                readFile();
                break;
            case 10:
                System.out.println("Exit");
                break;
            default:
        }
    } while (choose != 10);
    }

    private static void addPhone() {
        System.out.print("Enter the quantity to be added: ");
        int n = checkInput.checkInteger(1, 10);
        for (int i = 0; i < n; i++) {
            code = ++count;
            System.out.print("Name telephone " + code + ":\t");
            String name = checkInput.checkString();
            System.out.print("Color: ");
            String color = checkInput.checkString();
            System.out.print("Year Manufacture: ");
            int yearmanufacture = checkInput.checkInteger(2000, 2021);
            System.out.print("Made in: ");
            String made = checkInput.checkString();
            System.out.print("Price (USD): ");
            Double price = checkInput.checkDouble(1, 10000);
            phoneList.add(new Phone(name, color, made, yearmanufacture, price));
        }
    }

    private static void editPhoneByCode() {
        System.out.print("Enter the code to edit: ");
        int codePhone = checkInput.checkInteger(1, phoneList.size());
        for (int i = 0; i < phoneList.size(); i++) {
            if (codePhone == phoneList.get(i).getCode()) {
                System.out.print("Name telephone: ");
                phoneList.get(i).setName(checkInput.checkString());
                System.out.print("Color: ");
                phoneList.get(i).setColor(checkInput.checkString());
                System.out.print("Year Manufacture: ");
                phoneList.get(i).setYearmanufacture(checkInput.checkInteger(2010, 2021));
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

    private static void deletePhoneByCode() {
        System.out.print("Enter the code to delete: ");
        int code =checkInput.checkInteger(1, phoneList.size());
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

    private static void displayPhone() {
        System.out.println("\n\t\t==================================================PHONE LIST=================================================");
        System.out.println("\n\t\tName                  Code             Color              YearManufacture             Made             Spice");
        for (Phone phone : phoneList) {
            phone.display();
        }
        System.out.println("\n\t\t==============================================================================================================");
        System.out.println();
    }

    private static void rankPhoneByPrice() {
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

    private static void editPriceByCode() {
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

    private static void findPhoneByName() {
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

    private static void saveFile(List<Phone> phoneList) {
        try {
            FileWriter file = new FileWriter("phone.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(file);
            for (Phone phone : phoneList) {
                bufferedWriter.write(phone.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            file.close();
        } catch (Exception e) {

        }
    }

    private static void readFile() {
        List<Phone>phoneList = new ArrayList<>();
        String line;
        try {
            FileReader file = new FileReader("phone.txt");
            BufferedReader bufferedReader = new BufferedReader(file);
            showMenu();
            do {
                line = bufferedReader.readLine();
                System.out.println(line);
            } while (line != null);
            bufferedReader.close();
            file.close();
        } catch (Exception e) {

        }
    }

    public static void showMenu() {
        System.out.println("\t\t\t=====================MENU==================");
        System.out.println("\t\t\t|      1. AddPhone                        |");
        System.out.println("\t\t\t|      2. EditPhoneById                   |");
        System.out.println("\t\t\t|      3. DeletePhoneById                 |");
        System.out.println("\t\t\t|      4. DisplayPhone                    |");
        System.out.println("\t\t\t|      5. RankPhoneByPrice                |");
        System.out.println("\t\t\t|      6. EditPriceById                   |");
        System.out.println("\t\t\t|      7. FindPhoneByName                 |");
        System.out.println("\t\t\t|      8. SaveFile                        |");
        System.out.println("\t\t\t|      9. ReadFile                        |");
        System.out.println("\t\t\t|      10. Exit                           |");
        System.out.println("\t\t\t===========================================");
        System.out.print("Enter your selection: ");
    }
}
