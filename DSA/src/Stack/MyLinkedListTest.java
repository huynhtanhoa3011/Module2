package Stack;

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList stack = new MyLinkedList();

        stack.push(new Node(13));
        stack.push(new Node(12));
        stack.push(new Node(11));
        stack.push(new Node(10));
        stack.push(new Node(9));
        stack.print();


        Node node = stack.peek();
        if (node != null) {
            System.out.print("Peek\n");
            node.printData();
        }

        Node node2 = (Node) stack.pop();
        if (node != null) {
            System.out.print("Pop\n");
            node.printData();
        }

        System.out.println(" ");

        System.out.println(stack.peek());

        System.out.println("Is Stack Empty: " + stack.isEmpty());

        System.out.println("Is Stack Full: " + stack.isFull());


    }
}
