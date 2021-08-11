package Stack;

public class Node {
    private int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void printData() {
        System.out.println( this.data);
    }
}
