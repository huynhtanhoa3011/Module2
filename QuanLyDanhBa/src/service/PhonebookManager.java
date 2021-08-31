package service;

import check.CheckInput;
import model.PhoneBook;
import repository.PhonebookRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhonebookManager {
    private static int id = 0;
    static int count = 0;
    private CheckInput checkInput = new CheckInput();
    private List<PhoneBook> phoneBookList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    private static PhonebookRepository phonebookRepository;

    public PhonebookManager() {
        phonebookRepository = new PhonebookRepository();
    }

    public static void showMenu() {
        System.out.println("==================MENU================");
        System.out.println("1. Hiển thị danh bạ");
        System.out.println("2. Thêm danh bạ");
        System.out.println("3. Sửa danh bạ theo id");
        System.out.println("4. Xóa danh bạ theo id");
        System.out.println("5. Sửa số điện thoại theo id");
        System.out.println("6. Tìm kiếm danh bạ theo tên");
        System.out.println("7. Thoát");
        System.out.println("======================================");
        System.out.print("Nhập lựa chọn của bạn: ");
    }

    public void displayPhoneBook() {
        phoneBookList = phonebookRepository.readFile();
        System.out.println("\n====================================DANH BẠ===========================================");
        System.out.println("\nTên                   id        Ngày sinh           Địa chỉ              Số điện thoại");
        for (PhoneBook phoneBook : phoneBookList) {
            phoneBook.display();
        }
        System.out.println("\n======================================================================================");
        System.out.println();
    }

    public void addPhoneBook() {
        do {
            Scanner sc = new Scanner(System.in);
            id = ++count;
            System.out.print("Tên " + id + ":\t");
//            String name = checkInput.checkString();
            String name = Regex.inputName();
            System.out.print("Ngày sinh: ");
//            String birthday = checkInput.checkString();
            String birthday = Regex.inputBirthday();
            System.out.print("Địa chỉ: ");
            String address = checkInput.checkString();
            System.out.print("Số điện thoại: ");
//            String numberPhone = checkInput.checkString();
            String numberPhone = Regex.inputNumberPhone();

            PhoneBook phoneBook = new PhoneBook(name, id, birthday, address, numberPhone);
            phoneBookList.add(phoneBook);
            phonebookRepository.saveFile(phoneBookList);

            System.out.print("Quay về Menu(chọn y), tiếp tục thêm danh bạ(chọn n): ");
        } while (!sc.nextLine().equals("y"));
    }

    public void editPhoneBookById() {
        System.out.print("Nhập Id danh bạ cần chỉnh sửa: ");
        int idPhoneBook = checkInput.checkInteger(1, phoneBookList.size());
        for (int i = 0; i < phoneBookList.size(); i++) {
            if (idPhoneBook == phoneBookList.get(i).getId()) {
                System.out.print("Tên: ");
                phoneBookList.get(i).setName(checkInput.checkString());
                System.out.print("Ngày sinh: ");
                phoneBookList.get(i).setBirthday(checkInput.checkString());
                System.out.print("Địa chỉ: ");
                phoneBookList.get(i).setAddress(checkInput.checkString());
                System.out.print("Số điện thoại: ");
                phoneBookList.get(i).setNumberPhone(checkInput.checkString());
                phonebookRepository.saveFile(phoneBookList);
                break;
            }
        }
        System.out.println("\n===================================DANH BẠ SAU KHI SỬA================================");
        System.out.println("\nTên                   id        Ngày sinh           Địa chỉ              Số điện thoại");
        for (PhoneBook phoneBook : phoneBookList) {
            phoneBook.display();
        }
        System.out.println("\n======================================================================================");
        System.out.println();
    }

    public void deletePhoneBookById() {
        System.out.print("Nhập Id danh bạ cần xóa: ");
        int id = checkInput.checkInteger(1, phoneBookList.size());
        for (PhoneBook phoneBook : phoneBookList) {
            if (phoneBook.getId() == id) {
                phoneBookList.remove(phoneBook);
                phonebookRepository.saveFile(phoneBookList);
                break;
            }
        }
        System.out.println("\n===================================DANH BẠ SAU KHI XÓA================================");
        System.out.println("\nTên                   id        Ngày sinh           Địa chỉ              Số điện thoại");
        for (PhoneBook phoneBook : phoneBookList) {
            phoneBook.display();
        }
        System.out.println("\n======================================================================================");
        System.out.println();
    }

    public void editNumberPhoneById() {
        System.out.print("Nhập Id danh bạ cần sửa số điện thoại: ");
        int idPhoneBook = checkInput.checkInteger(1, phoneBookList.size());
        for (int i = 0; i < phoneBookList.size(); i++) {
            if (idPhoneBook == phoneBookList.get(i).getId()) {
                System.out.print("Số điện thoại: ");
                phoneBookList.get(i).setNumberPhone(checkInput.checkString());
                phonebookRepository.saveFile(phoneBookList);
                break;
            }
        }
        System.out.println("\n==========================DANH BẠ SAU KHI SỬA SỐ ĐIỆN THOẠI===========================");
        System.out.println("\nTên                   id        Ngày sinh           Địa chỉ              Số điện thoại");
        for (PhoneBook phoneBook : phoneBookList) {
            phoneBook.display();
        }
        System.out.println("\n======================================================================================");
        System.out.println();
    }

    public void findPhoneBookByName() {
        String name;
        System.out.print("Nhập tên trong danh bạ cần tìm: ");
        name = sc.nextLine();
        for (PhoneBook phoneBook : phoneBookList) {
            if (name.equalsIgnoreCase(phoneBook.getName())) {
                phoneBook.display();
                phonebookRepository.saveFile(phoneBookList);
                break;
            }
        }
        System.out.println();
    }

}
