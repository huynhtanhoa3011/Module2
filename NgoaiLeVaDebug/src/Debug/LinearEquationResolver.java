package Debug;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("giải phương trình bậc nhất");
        System.out.println("cho phương trình 'a * x + b = 0', nhập số: ");

        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b: ");
        double b = sc.nextDouble();

        if (a != 0) {
            double solution = -b/a;
            System.out.printf("The solution is: %f!", solution);
        } else {
            if (b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution1");
            }
        }
    }
}
