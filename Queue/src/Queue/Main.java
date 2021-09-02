package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args) {
        //QUEUE
        Queue<String> queue = new LinkedBlockingQueue<>(2);
//        if (queue.offer("A")) {
//            System.out.println("Kho Chua day,da them A vao!");
//
//        } else
//            System.out.println("Kho da day,khong the them A.");
//        System.out.println(queue);
//
//        if (queue.offer("B")) {
//            System.out.println("Kho Chua day,da them B vao!");
//        } else
//            System.out.println("Kho da day,khong the them B.");
//        System.out.println(queue);
//
//        if (queue.offer("C")) {
//            System.out.println("Kho Chua day,da them C vao!");
//        } else
//            System.out.println("Kho da day,khong the them C.");
//        System.out.println(queue);

//        queue.remove("A");
//        System.out.println(queue);
//
//        System.out.println(queue.isEmpty());
//
//        System.out.println(queue.size());
//        System.out.println(queue.peek());

        add();

    }

    public static void add() {
        Queue<Integer> queue = new LinkedBlockingQueue<>(15);
        for (int i = 0; i < 20; i++) {
            if (queue.offer(i)) {
                System.out.println("Kho Chua day,da them " + i + " vao!");

            } else
                System.out.println("Kho da day,khong the them " + i);
            System.out.println(queue);
        }
    }


}
