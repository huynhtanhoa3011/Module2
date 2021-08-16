package IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a + b < c || a + c < b || b + c < a)
            throw new IllegalTriangleException("Không phải là tam giác.");
        else
            System.out.println("Là một tam giác");
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        try {
            if (a <= 0 || b <= 0 || c <= 0 ){
                System.out.println("Wrong side's value!");
            }
            Triangle obj = new Triangle(a, b, c);
        } catch (Exception m) {
            System.out.println("Exception occurred: " + m);//Ngoại lệ xảy ra
        }
    }
}

class IllegalTriangleException extends Exception {//lớp ngoại lệ kế thừa lớp Exception

    IllegalTriangleException(String s) {
        super(s);
    }
}
