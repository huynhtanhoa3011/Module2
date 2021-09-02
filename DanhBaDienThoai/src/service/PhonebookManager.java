package service;

import check.CheckInput;
import model.PhoneBook;
import regex.Regex;
import writefileReadfile.PhonebookWriteReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhonebookManager {
    private static int id = 0;
    static int count = 0;
    private CheckInput checkInput = new CheckInput();
    private List<PhoneBook> phoneBookList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    private static PhonebookWriteReadFile phonebookWriteReadFile;

    public PhonebookManager() {
        phonebookWriteReadFile = new PhonebookWriteReadFile();
    }
    public static void showMenu() {
        System.out.println("==================MENU================");
        System.out.println("1. Xem danh bạ");
        System.out.println("2. Thêm danh bạ");
        System.out.println("3. Cập nhật danh bạ theo số điện thoại");
        System.out.println("4. Xóa danh bạ theo số điện thoại");
        System.out.println("5. Sửa số điện thoại theo id");
        System.out.println("6. Tìm kiếm danh bạ theo tên");
        System.out.println("7. Thoát");
        System.out.println("======================================");
        System.out.print("Nhập lựa chọn của bạn: ");
    }

    public void displayPhoneBook() {
        phoneBookList = phonebookWriteReadFile.readFile();
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
            String name = Regex.inputName();
            System.out.print("Ngày sinh: ");
            String birthday = Regex.inputBirthday();
            System.out.print("Địa chỉ: ");
            String address = checkInput.checkString();
            System.out.print("Số điện thoại: ");
            String numberPhone = Regex.inputNumberPhone();

            PhoneBook phoneBook = new PhoneBook(name, id, birthday, address, numberPhone);
            phoneBookList.add(phoneBook);
            phonebookWriteReadFile.saveFile(phoneBookList);

            System.out.print("Quay về Menu(chọn y), tiếp tục thêm danh bạ(chọn n): ");
        } while (!sc.nextLine().equals("y"));
    }

    public void editPhoneBookByNumberPhone() {
        System.out.print("Nhập số điện danh bạ cần chỉnh sửa: ");
        int numberPhoneBook = checkInput.checkInteger(1, phoneBookList.size());
        for (int i = 0; i < phoneBookList.size(); i++) {
            if (numberPhoneBook == phoneBookList.get(i).getId()) {
                System.out.print("Tên: ");
                phoneBookList.get(i).setName(checkInput.checkString());
                System.out.print("Ngày sinh: ");
                phoneBookList.get(i).setBirthday(checkInput.checkString());
                System.out.print("Địa chỉ: ");
                phoneBookList.get(i).setAddress(checkInput.checkString());
                System.out.print("Số điện thoại: ");
                phoneBookList.get(i).setNumberPhone(checkInput.checkInteger(1, 10));
                phonebookWriteReadFile.saveFile(phoneBookList);
                break;
            }
        }
        System.out.println("\n====================================DANH BẠ===========================================");
        System.out.println("\nTên                   id        Ngày sinh           Địa chỉ              Số điện thoại");
        for (PhoneBook phoneBook : phoneBookList) {
            phoneBook.display();
        }
        System.out.println("\n======================================================================================");
        System.out.println();
    }

    public void deletePhoneBookByNumberPhone() {
    }

    public void editNumberPhoneById() {
    }

    public void findPhoneBookByName() {
    }
}
