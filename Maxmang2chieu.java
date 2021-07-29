import java.util.Scanner;

public class Maxmang2chieu {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số dòng ma trận: ");
        a = scanner.nextInt();
        System.out.println("nhập số cột ma trận: ");
        b = scanner.nextInt();

        int A[][] = new int[a][b];
        System.out.println("nhập các phần tử ma trận: ");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++) {
                System.out.println("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        int max = A[0][0];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j > b; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
        System.out.println("phần tử lớn nhất trong ma trận là: " + max);

    }
}
