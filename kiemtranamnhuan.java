import java.util.Scanner;

public class kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("nhập năm: ");
        year = scanner.nextInt();
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {

            boolean isDivisible100 = year % 100 == 0;
            if (isDivisible100) {

                boolean isDivisible400 = year % 400 == 0;
                if (isDivisible400) {
                    isLeapYear = true;
                }

        } else {
            isLeapYear = true;
        }
    }
    if(isLeapYear) {
        System.out.printf("năm nhuận");
    } else {
        System.out.printf("không phải năm nhuận");
    }
}
}
