import java.util.Scanner;

public class Chenphantutrongmang {
    public static void main(String[] args) {
//        khai báo và khởi tạo mảng số nguyên
        int[] arrNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Mảng trước khi chèn phần tử: ");
        Scanner scanner = new Scanner(System.in);
        int index;
        int value;
        for (int X:arrNumber) {
            System.out.print(X + " ");
        }
        System.out.println(" ");

//        nhập số vị trí và số cần chèn
        do {
            System.out.println("Nhập vị trí cần chèn: ");
            index = scanner.nextInt();
            System.out.println("Nhập số cần chèn: ");
        } while (index <= 0 || index > arrNumber.length);
        value = scanner.nextInt();
        for (int i = arrNumber.length - 1; i > index; i--) {
            arrNumber[i] = arrNumber[i - 1];
        }

//        chèn phần tử ở vị trí index
        arrNumber[index] = value;
        System.out.println("Mảng sau khi chèn phần tử: ");
        for (int Y:arrNumber) {
            System.out.print(Y + " ");
        }

    }
}
