package StackArray;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("abc");
        stack.push("ikm");
        stack.push("xyz");

        stack.printStack();

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println("Is Stack Empty: " + stack.isEmpty());

        System.out.println("Is Stack Full: " + stack.isFull());
    }
}
