package MobileManager;

import java.util.Scanner;

public class CheckInput {
    Scanner sc = new Scanner(System.in);
    public int checkInteger (int min, int max) {
        int num = 0;
        while (true) {
            try {
                num = sc.nextInt();
                if (num >= min && num <= max) {
                    break;
                } else {
                    System.out.println(num + "\tdoes not exist, just enter the word: " + min + " -> " + max);
                    System.out.print("Please re-enter: ");
                }
            } catch (Exception e) {
                System.out.print("Input data type integer: ");
            } finally {
                sc.nextLine();
            }
        }
        return num;
    }

    public double checkDouble (int min, int max) {
        double num = 0;
        while (true) {
            try {
                num = Double.parseDouble(sc.nextLine());
                if (num >= min && num <= max) {
                    break;
                } else {
                    System.out.println(num + "\tdoes not exist, just enter the word: " + min + " -> " + max);
                    System.out.print("Please re-enter: ");
                }
            } catch (Exception e) {
                System.out.print("Input data type double: ");
            }
        }
        return num;
    }

    public String checkString() {
        String string;
        while (true) {
            try {
                string = sc.nextLine();
                if (!string.trim().isEmpty()) {
                    break;
                } else {
                    System.out.print("Please re-enter: ");
                }
            } catch (Exception e) {
                System.out.print("Input data type string: ");
            }
        }
        return string;
    }
}
