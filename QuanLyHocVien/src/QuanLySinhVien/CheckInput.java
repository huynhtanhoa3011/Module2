package QuanLySinhVien;

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
                    System.out.println(num + "\tkhông tồn tại chỉ nhập từ " + min + " -> " + max);
                    System.out.print("Nhập lại: ");

                }
            } catch (Exception e) {
                System.out.print("Nhập kiểu dữ liệu số nguyên: ");
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
                    System.out.println(num + "\tKhông tồn tại chỉ nhập từ: " + min + " -> " + max);
                    System.out.print("Nhập lại:");
                }
            } catch (Exception e) {
                System.out.print("Nhập kiểu dữ liệu double: ");
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
                    System.out.println(string + "Nhập lại: ");
                }
            } catch (Exception e) {
                System.out.print("Nhập kiểu dữ liệu String: ");
            }
        }
        return string;
    }
}
