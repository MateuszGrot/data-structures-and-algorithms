package pl.mateuszgrot;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        // FIFO - firts in first out
        // cannot use "new queue" - has to be Linked List; queue is interface!
        // can use collection class (inheritance), use useful methods

        System.out.println(queue.isEmpty());

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Chad"));
        System.out.println(queue);
        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());

        // Usecase:
        // 1. Keyboard buffer
        // 2. Printer queue
        // 3. Used LinkedList, Priority Queues, Breadth first serch


    }
}