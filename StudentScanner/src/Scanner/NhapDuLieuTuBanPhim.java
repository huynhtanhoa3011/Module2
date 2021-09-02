package Scanner;

import java.util.Scanner;

public class NhapDuLieuTuBanPhim {

    public static void main(String[] args) {
        int a, x;
        float f;
        double d;
        boolean b;
        String firstName;
        String fullName;

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Nhập vào 2 giá trị kiểu int: ");
//        a = scanner.nextInt();
//        x = scanner.nextInt();
//        System.out.println("a = " + a);

//        f = scanner.nextFloat();
//        System.out.println("f = " + f);

//        System.out.println("Nhập vapf giá trị double: ");
//        d = scanner.nextDouble();
//        System.out.println("d = " + d);

//        System.out.println("Nhập vào giá trị true or false: ");
//        b = scanner.hasNextBoolean();
//        System.out.println("b = " + b);

//        System.out.println("Nhập tên của bạn: ");
//        firstName = scanner.next();
//        System.out.println("Hello" + firstName);

        System.out.println("Nhập tên fullName: ");
        fullName = scanner.nextLine();
        System.out.println("Hello: " + fullName);
    }
}
