package Queue;

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList queue = new MyLinkedList();

        queue.enqueue(new Node(13));
        queue.enqueue(new Node(12));
        queue.enqueue(new Node(11));
        queue.enqueue(new Node(10));
        queue.enqueue(new Node(9));

        queue.print();

        Node node = queue.dequeue();
        if (node != null) {
            System.out.print("dequeue\n");
            node.printData();
        }

        System.out.print("\n");
        queue.print();

        System.out.println(queue.isEmpty());

    }
}
