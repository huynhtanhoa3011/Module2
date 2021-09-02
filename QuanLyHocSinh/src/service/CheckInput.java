package service;


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
                    System.err.println(num + "\tkhông tồn tại chỉ nhập từ " + min + " -> " + max);
                    System.err.print("Nhập lại: ");

                }
            } catch (Exception e) {
                System.err.print("Nhập kiểu dữ liệu số nguyên: ");
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
                    System.err.println(num + "\tKhông tồn tại chỉ nhập từ: " + min + " -> " + max);
                    System.err.print("Nhập lại:");
                }
            } catch (Exception e) {
                System.err.print("Nhập kiểu dữ liệu double: ");
            }
        }
        return num;
    }

    public String checkString() {
        String string;
//        boolean check;
        while (true) {
            try {
                string = sc.nextLine();

//                String regex = "^[_a-zA-Z 0-9]+$";
//                check = string.matches(regex);
//                if (!string.trim().isEmpty() && check == true) {
                if (!string.trim().isEmpty()) {
                    break;
                } else {
                    System.err.println(string + "Nhập lại: ");
                }
            } catch (Exception e) {
                System.err.print("Nhập kiểu dữ liệu String: ");
            }
        }
        return string;
    }
}
