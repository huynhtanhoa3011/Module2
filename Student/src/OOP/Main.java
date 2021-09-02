package OOP;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        System.out.println("xin chào mọi người");
//        System.out.println("tôi là một lập trình viên");

//        BÀI 3: CÁC KIỂU DỮ LIỆU
//        System.out.println("\nsize of byte in bit: " + Byte.SIZE);     // Kiểu dữ liệu số nguyên 8 bit
//        System.out.println("min value of byte: " + Byte.MIN_VALUE);   // Kích thước nhỏ nhất -128
//        System.out.println("max value of byte: " + Byte.MAX_VALUE);  // Kích thước lớn nhất 127
//
//        System.out.println("\nsize of short in bit: " + Short.SIZE);     // Kiểu dữ liệu số nguyên 16 bit
//        System.out.println("min value of short: " + Short.MIN_VALUE);   // Kích thước nhỏ nhất -32768
//        System.out.println("max value of short: " + Short.MAX_VALUE);  // Kích thước lớn nhất 32767
//
//        System.out.println("\nsize of int in bit: " + Integer.SIZE);     // Kiểu dữ liệu số nguyên 32 bit
//        System.out.println("min value of int: " + Integer.MIN_VALUE);   // Kích thước nhỏ nhất -2147483648
//        System.out.println("max value of int: " + Integer.MAX_VALUE);  // Kích thước lớn nhất 2147483647
//
//        System.out.println("\nsize of long in bit: " + Long.SIZE);     // Kiểu dữ liệu số nguyên 64 bit
//        System.out.println("min value of long: " + Long.MIN_VALUE);   // Kích thước nhỏ nhất -9223372036854775808
//        System.out.println("max value of long: " + Long.MAX_VALUE);  // Kích thước lớn nhất 9223372036854775807
//
//        System.out.println("\nsize of float in bit: " + Float.SIZE);     // Kiểu dữ liệu số thực 32 bit
//        System.out.println("min value of float: " + Float.MIN_VALUE);   // Kích thước nhỏ nhất
//        System.out.println("max value of float: " + Float.MAX_VALUE);  // Kích thước lớn nhất
//
//        System.out.println("\nsize of double in bit: " + Double.SIZE);     // Kiểu dữ liệu số thực 64 bit
//        System.out.println("min value of double: " + Double.MIN_VALUE);   // Kích thước nhỏ nhất
//        System.out.println("max value of double: " + Double.MAX_VALUE);  // Kích thước lớn nhất
//
//        System.out.println("\nsize of char: " + Character.SIZE);         // Kiểu kí tự Unicode có kích thước 2byte
////        System.out.println("min value of char: " + Character.MIN_VALUE);
////        System.out.println("max value of char: " + Character.MAX_VALUE);
//
//        System.out.println("\ntrue or false: " + (2 < 3));


//        BÀI 4: CÁC BIẾN  TRONG JAVA
//        int a = 0;
//        int b = 125;
//        int c, d, e, f;
//
//        float PI = 3.141592f;
//        char k = 'U';
//        boolean bool = true;
//
//        int age = 30;
//        float mark = 9.5f;
//        int sumOfAAndB = a+ b;
//
//        float r = 6.25f;
//        float area = PI * r * r;
//        System.out.println("area is: " + area);


//        BÀI 5: CÁC LOẠI TOÁN TỬ
//        Toán tử toán học
//        int a = 5, b = 10, c = 20;
//        int sum = a + b + c + 15 - 23;
//        float x = (float) a / b;
//        System.out.println("sum is: " + sum);
//        System.out.println("x = " + x);
//        System.out.println("a % 3 = " + (a % 3));
//        a--;
//        a++;
//        System.out.println("a = " + a);

//        Toán tử so sánh
//        int a = 20, b = 40;
//        System.out.println("a < b ?" + (a < b));
//        System.out.println("a > b ?" + (a > b));
//        System.out.println("a >= b ?" + (a >= b));
//        System.out.println("a <= b ?" + (a <= b));
//        System.out.println("a == b ?" + (a == b));
//        System.out.println("a != b ?" + (a != b));

//        Toán tử gán
//        int a = 100;
//        int b = 100;
//
//        int c = a++;
//        int d = ++b;
//        System.out.println("c = " + c + ",a = " + a);
//        System.out.println("d = " + d + ",b = " + b);


//        BÁI 6: STRING TRONG JAVA
//        String name = "Hoa";
//        String msg = "Hello\tWorld!";
//
//        String getting = msg + " " + name;
//        String str = "\'";
//
//        int a = 10;
//        int b = 15;
//        String x = (a + b) + name;
//        String y = name + (a + b);
//        System.out.println(" "+ x + " "+ y);
//
//
//        System.out.println(getting);
//        System.out.println(msg.indexOf("W"));


//        BÀI 7: TÌM HIỂU LỚP MATH
//        int a = 10;
//        int b = 55;
//        float x = -234.567f;
//        int max = Math.max(a, b);
//        int min = Math.min(a, b);
//        System.out.println("sqrt(a) = " + Math.sqrt(a));
//        System.out.println("max a, b = " + max);
//        System.out.println("min a, b = " + min);
//        System.out.println("làm tròn x: " + Math.round(x));


//        BÀI 8: CẤU TRÚC IF ELSE
//        int day = 2;
//        if(day == 1) {
//            System.out.println("Thứ 2");
//        } else if(day == 2) {
//            System.out.println("Thứ 3");
//        } else if (day == 3) {
//            System.out.println("Thứ 4");
//        } else if (day == 4) {
//            System.out.println("Thứ 5");
//        } else if (day == 5) {
//            System.out.println("Thứ 6");
//        } else if (day == 6) {
//            System.out.println("Thứ 7");
//        } else if (day == 7) {
//            System.out.println("Chủ Nhật");
//        } else {
//            System.out.println("Ngày không hợp lệ");
//        }


//        BÀI 9: TOÁN TỬ BA NGÔI
//        int a = 105;
//        String str1 = "a la so chan";
//        String str2 = "a la so le";
//        String str = " ";
//
////        if(a % 2 == 0) {
////            str = str1;
////        } else {
////            str = str2;
////        }
//        str = (a % 2 == 0) ? str1 : str2;
//        System.out.println("ket qua: " + str);


//        BÀI 10: CẤU TRÚC SWITCH CASE
//        int day = 5;
//        switch (day) {
//            case 1:
//                System.out.println("Thứ 2");
//                break;
//            case 2:
//                System.out.println("Thứ 3");
//                break;
//            case 3:
//                System.out.println("Thứ 4");
//                break;
//            case 4:
//                System.out.println("Thứ 5");
//                break;
//            case 5:
//                System.out.println("Thứ 6");
//                break;
//            case 6:
//                System.out.println("Thứ 7");
//                break;
//            case 7:
//                System.out.println("chủ nhật");
//                break;
//            default:
//                System.out.println("Ngày không hợp lệ");
//        }
        
        
//        BAI 11: CẤU TRÚC  LẶP FOR
//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);
//        }


//        int sum = 0;
////        float sum = 0;
//        int n = 10;
//        for (int i = 1; i <= n; i++) {
// //           sum += (float) 1/i;
//        }
//        System.out.println("Tổng từ 1 đến 100 là: " + sum);


//        BÀI 12: VÒNG LẶP WHILE
//        vd1:
//        int n = 600;
//        float sum = 0;
//        int i = 1;
//        while (i <= n) {
//            sum += (float) 1 / i;
//            i++;
//        }
//        System.out.println("sum = " + sum);

//        vd2: in ra các ký tự trong sâu ký tự
//        String msg = "Hello World!";
//        int i = 0;
//        while (i < msg.length()) {
//            System.out.println(msg.charAt(i));
//            i++;
//        }


        //        BÀI 12: VÒNG LẶP DO-WHILE
//        int i = 0;
//        int n = 3;
//        do {
//            System.out.println("Hello  codegym");
//            System.out.println("i = " + i);
//            i++;
//        } while (i < n);


        //        BÀI 12: VÒNG LẶP LỒNG NHAU
//        vd1: in ma trận 2 chiều
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 15; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println("");
//        }

//        vd2: in hình chữ nhật rỗng
//        int m = 5;
//        int n = 8;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == m -1 || j == 0 || j == n - 1){
//                    System.out.print(" * ");
//                } else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println("");
//        }

        //        BÀI 12: LỆNH BREAK, CONTINUE
//        int n = 100;
//        int sum = 0;
//        String msg = "Hello Codegym";
//        for (int i = 0; i < 100; i++) {
//            sum += i;
//            System.out.println("i = " + i);
//            if (i == 50) {
//                break;
//            }
//        }
//        System.out.println("sum = " + sum);

//        for (int i = 0; i < msg.length(); i++) {
//            if (msg.charAt(i) == ' ') {
//                continue;
//            }
//            System.out.println(msg.charAt(i));
//        }

//        for (int i = 0; i < n; i++) {
//            if (i % 2 != 0) {
//                continue;
//            }
//            System.out.println(i);
//        }
    }
}
