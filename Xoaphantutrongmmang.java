import java.util.Scanner;

public class Xoaphantutrongmmang {
    public static void main(String[] args) {
//        khai báo và khởi tạo mảng số nguyên
        int[] arrNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int numb;
        Scanner scanner = new Scanner(System.in);
//        nhập phần tử cần xóa
        System.out.println("Nhập số cần xóa: ");
        numb = scanner.nextInt();
//        xem vị trí xuất hiện của X
        int index = 0;
        for (int i = 0; i < arrNumber.length; i++) {
            if (numb == arrNumber[i]) {
                index = i;
                System.out.println("vị trí số cần tìm: " + index);

            }
        }
        for (int j = index; j < arrNumber.length - 1; j++) {
            arrNumber[j] = arrNumber [j + 1];
        }
//        xóa phần tử
        System.out.println("Sau khi xóa phần tử trong mảng: ");
        for (int X:arrNumber) {
            System.out.print(X + " ");
        }
    }
}
