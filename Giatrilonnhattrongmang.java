import java.util.Scanner;

public class Giatrilonnhattrongmang {
    public static void main(String[] args) {
//        khai báo biến, nhập và kiểm tra
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập kích cỡ: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("kích cỡ không vượt quá 20");
        } while (size > 20);
//        nhập giá trị
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập phần tử" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
//         in danh sách
            System.out.println("Danh sách tài sản: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
//            dùng vòng lặp for duyệt mảng để tìm giá trị lớn nhất và vị trí
                int max = array[0];
                int  index = 1;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] > max) {
                        max = array[j];
                        index = j + 1;
                    }
                }
                System.out.println("giá trị tài sản lớn nhất trong sanh sách là" + max + ", ở vị trí" + index);
            }
        }
    }

