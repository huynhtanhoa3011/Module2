package StackLinkedList;

import java.util.LinkedList;

public class MyStackLinkedList {
    private LinkedList<String> strings = new LinkedList<>();

    public void push(String str) {
        strings.addFirst(str);
    }

    public String pop() {
        if (strings.isEmpty())
            return null;
        return strings.removeLast();
    }

    public boolean isEmpty() {
        return strings.isEmpty();
    }

    public boolean isFull() {
        return strings.size() != 0;
    }

    public String peek() {
        if (strings.isEmpty())
            return null;
        return strings.getLast();
    }

    public void printStack() {
        System.out.println(strings);
    }
}
