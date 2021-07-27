import java.util.Scanner;

public class phuongtrinhbacnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cho phương trình 'a * x + b = c', nhập hằng số: ");
        System.out.println("nhập a: ");
        float a = scanner.nextFloat();
        System.out.println("nhập b: ");
        float b = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("phương trình vô số nghiệm");
            } else if (b == 0) {
                System.out.println("phương trình vô nghiệm");
            }
        } else {
            System.out.println("phương trình có nghiệm: " + -b / a);
        }
    }
}
