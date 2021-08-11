package LinkedList;

public class MyLinkedListTest {

    public static void main(String[] args) {
        System.out.println("******** TESTING ********");
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst(9);
        linkedList.addFirst(10);
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);

        linkedList.printList();

    }
}
