package presentation;

import service.BuyerService;
import service.CheckInput;
import model.Phone;
import service.PhoneManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    private static int id = 0;
    static int count = 0;
    static CheckInput checkInput = new CheckInput();
    static List<Phone> phoneList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


       int choose ;
      do {
          System.out.println(ANSI_RED + "\t\t\t\t****WELCOME TO PHONESTORE BY HOA.HUYNH**** "+ ANSI_GREEN);
          System.out.println(ANSI_GREEN+"\t\t\t\t\t\t==========MENU========="+ ANSI_PURPLE);
          System.out.println("\t\t\t\t\t\t||    1. Manager     ||");
          System.out.println("\t\t\t\t\t\t||    2. Customer    ||");
          System.out.println(ANSI_GREEN+"\t\t\t\t\t\t======================="+ ANSI_YELLOW);
          System.out.print("\t\t\t\t\t\tEnter your selection: ");
          choose= checkInput.checkInteger(1, 2);
          switch (choose){
              case 1:
                  Admin();
                  break;
              case 2:
                  Buyer();
                  break;
          }
      }while (choose!=0);

    }
    private static void Buyer(){
        BuyerService buyerService = new BuyerService();
        int choose;
        do {
            BuyerService.showProduct();
            choose = checkInput.checkInteger(1, 6);

            switch (choose) {
                case 1:
                    buyerService.addCustomerName();
                    break;
                case 2:
                    buyerService.editCustomerName();
                    break;
                case 3:
                    buyerService.deleteCustomerName();
                    break;
                case 4:
                    buyerService.displayCustomer();
                    break;
                case 5:
                    System.out.println(ANSI_PURPLE + "<3<3<3 THANK YOU FOR USING THE PRODUCT <3<3<3");
                    break;
                default:
            }
        } while (choose != 5);
    }

    private static void Admin(){
        PhoneManager phoneManager=new PhoneManager();
        int choose;
        do {
            PhoneManager.showMenu();
            choose = checkInput.checkInteger(1, 8);

            switch (choose) {
                case 1:
                    phoneManager.addPhone();
                    break;
                case 2:
                    phoneManager.editPhoneByCode();
                    break;
                case 3:
                    phoneManager.deletePhoneByCode();
                    break;
                case 4:
                    phoneManager.displayPhone();
                    break;
                case 5:
                    phoneManager.rankPhoneByPrice();
                    break;
                case 6:
                    phoneManager.editPriceByCode();
                    break;
                case 7:
                    phoneManager.findPhoneByName();
                    break;
                case 8:
                    System.out.println("Exit");
                    System.out.println("___Thankyou very much___");
                    break;
                default:
            }
        } while (choose != 8);
    }
}
