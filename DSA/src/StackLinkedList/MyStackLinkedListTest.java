package StackLinkedList;

public class MyStackLinkedListTest {
    public static void main(String[] args) {
        MyStackLinkedList stackLinkedList = new MyStackLinkedList();
        stackLinkedList.push("abc");
        stackLinkedList.push("efh");
        stackLinkedList.push("xyz");

        stackLinkedList.printStack();

        System.out.println(stackLinkedList.pop());

        System.out.println(stackLinkedList.peek());

        System.out.println("Is Stack Empty: " + stackLinkedList.isEmpty());

        System.out.println("Is Stack Full: " + stackLinkedList.isFull());
    }
}
