package Stack;


public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
        this.size = 0;
        this.head = null;
    }

    public void push(Node node) {
        node.next = this.head;
        this.head = node;
        this.size++;
    }

    public Node pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty: ");
            return null;
        }
        return this.head;
    }

    public boolean isEmpty() {
        return (this.size == 0);
    }

    public void print() {
        System.out.println("Stack: ");
        Node node = this.head;
        while (node != null) {
            node.printData();
            node = node.next;
        }
    }

    public Stack.Node peek() {
        return null;
    }

    public boolean isFull() {
        return false;
    }
}
