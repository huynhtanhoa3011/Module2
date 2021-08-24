package presentation;

import service.CheckInput;
import model.Phone;
import service.PhoneManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int code = 0;
    static int count = 0;
    static CheckInput checkInput = new CheckInput();
    static List<Phone> phoneList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choose;
        do {
            PhoneManager.showMenu();
            choose = checkInput.checkInteger(1, 10);

            switch (choose) {
                case 1:
                    PhoneManager.addPhone();
                    break;
                case 2:
                    PhoneManager.editPhoneByCode();
                    break;
                case 3:
                    PhoneManager.deletePhoneByCode();
                    break;
                case 4:
                    PhoneManager.displayPhone();
                    break;
                case 5:
                    PhoneManager.rankPhoneByPrice();
                    break;
                case 6:
                    PhoneManager.editPriceByCode();
                    break;
                case 7:
                    PhoneManager.findPhoneByName();
                    break;
                case 8:
                    PhoneManager.saveFile();
                    break;
                case 9:
                    PhoneManager.readFile();
                    PhoneManager.displayPhone();
                    break;
                case 10:
                    System.out.println("Exit");
                    break;
                default:
            }
        } while (choose != 10);
    }
}
