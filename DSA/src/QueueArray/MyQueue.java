package QueueArray;

public class MyQueue {
    private int maxSize;
    private int size;
    private int head;
    private int tail;
    private Node[] queue;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.head = 0;
        this.tail = 0;
        this.queue = new Node[maxSize];
    }

    public boolean isEmpty() {
        return (this.size == 0);
    }

    public boolean isFull() {
        return (this.size == this.maxSize);
    }

    public void print() {
        System.out.println("Queue: \n");
    }
}
