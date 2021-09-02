package presentation;

import check.CheckInput;
import model.PhoneBook;
import service.PhonebookManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int conut = 0;
    private int id = 0;
    static CheckInput checkInput = new CheckInput();
    static List<PhoneBook> phoneBookList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        PhonebookManager phonebookManager = new PhonebookManager();
        int choose;
        do {
            PhonebookManager.showMenu();
            choose = checkInput.checkInteger(1, 7);
            switch (choose) {
                case 1:
                    phonebookManager.displayPhoneBook();
                    break;
                case 2:
                    phonebookManager.addPhoneBook();
                    break;
                case 3:
                    phonebookManager.editPhoneBookByNumberPhone();
                    break;
                case 4:
                    phonebookManager.deletePhoneBookByNumberPhone();
                    break;
                case 5:
                    phonebookManager.editNumberPhoneById();
                    break;
                case 6:
                    phonebookManager.findPhoneBookByName();
                    break;
                case 7:
                    System.out.println("Thoát!!!");
                    break;
            }
        } while (choose != 7);
    }
}
