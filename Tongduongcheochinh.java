import java.util.Random;
import java.util.Scanner;

public class Tongduongcheochinh {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số hàng: m =");
        m = scanner.nextInt();
        System.out.printf("Nhập số cột: n =");
        n = scanner.nextInt();

        int a[][] = new int[m][n];
        System.out.print("Nhập giá trị cho từng phần tử:\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
//                System.out.print("a["+i+"]["+j+"] = ");
//                a[i][j] = scanner.nextInt();
                Random ran = new Random();
                a[i][j] = ran.nextInt(100);
            }
        }

        System.out.print("\nmảng 2 chiều vừa nhập là:\n ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }

        int sumCheochinh = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j);
                sumCheochinh += a[i][j];
            }
        }
        System.out.println("Tổng các phần tử trên đường chéo chính là: " + sumCheochinh);
        }
    }


