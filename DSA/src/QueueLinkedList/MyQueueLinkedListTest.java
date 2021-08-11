package QueueLinkedList;

import QueueArray.MyQueue;

public class MyQueueLinkedListTest {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("abc");
        queue.enqueue("def");
        queue.enqueue("xyz");

        queue.printQueue();

        System.out.println(queue.peek());

        System.out.println(queue.dequeue());

        System.out.println(queue.isEmpty());

    }
}
