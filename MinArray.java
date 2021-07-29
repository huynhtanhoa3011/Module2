import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng: ");   //  khai báo mảng số nguyên có phần tử size
        a = scanner.nextInt();

        int[] array = new int[a];

        System.out.println("Nhập các phần tử trong mảng: ");   //  nhập giá trị cho các phần tử trong mảng
        for (int i = 0; i < a; i++) {
            System.out.print("phần tử thứ " + i + ":");        //  duyệt mảng gọi phần tử đầu có giá trị nhỏ nhất
            array[i] = scanner.nextInt();
        }
        int min = array[0];

        for (int i = 1; i < array.length; i++) {                //  duyệt mảng từ phần tử thứ 2
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("giá trị nhỏ nhất trong mảng là: " + min);
    }
}
