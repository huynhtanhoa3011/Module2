package QueueArray;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue("abc");
        queue.enqueue("xyz");
        queue.enqueue("mno");
        queue.printQueue();

        System.out.println(queue.peek());

        System.out.println("Is Stack Empty: " + queue.isEmpty());

        System.out.println("Is Stack Full: " + queue.isFull());


    }
}
