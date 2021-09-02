package Stack;


import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

//        PUSH
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        //System.out.println(stack);
//        System.out.println(stack.peek());

        System.out.println("=========");

        System.out.println("size: " + stack.size());

//        System.out.println(stack.pop());
//        System.out.println(stack);

//        System.out.println(stack.search(20));

        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println(stack.isEmpty());

    }
}
