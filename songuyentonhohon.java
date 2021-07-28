import java.util.Scanner;

public class songuyentonhohon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số: ");
        int numb = scanner.nextInt();
        for (int i = 2; i < numb; i++) {
            if (check(i)) {
                System.out.print(i + " ");
            }
        }
    }
    private static boolean check (int n) {
        int i = 2;
        for (i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
