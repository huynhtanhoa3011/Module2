package StackArray;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<String> element = new ArrayList<>();

    public void push(String str) {
        element.add(str);
    }

    public String pop() {
        if (element.isEmpty())
            return null;
        return element.remove(element.size() - 1);
    }

    public String peek() {
        if (element.isEmpty())
            return null;
        String top = element.get(element.size() - 1);
        return top;
    }

    public boolean isEmpty() {
        return element.isEmpty();
    }

    public boolean isFull() {
        if (element.size() == 0);
        return false;
    }

    public void printStack(){
        System.out.println(element);
    }
}
