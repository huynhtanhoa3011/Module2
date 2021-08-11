package DSA;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	int decimalNumber  = 123456789;
        System.out.println("He nhi phan " + decimalNumber + " la :");
        new Main().convertBinary(decimalNumber);
    }

    public void convertBinary(int num) {
        Stack<Integer> stack = new Stack<Integer>();
        while (num != 0) {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        while (!(stack.isEmpty())) {
            System.out.println(stack.pop());
        }
    }
}
