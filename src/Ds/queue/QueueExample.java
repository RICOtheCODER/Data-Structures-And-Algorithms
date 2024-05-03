package Ds.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {


        Queue<String> queue = new LinkedList<>();
        queue.offer("Hello"); //add elements to queue
        queue.offer("Hello1");
        queue.offer("Hello2");
        queue.offer("Hello3");
        System.out.println();
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        Deque<String> deque=new ArrayDeque<>();
        deque.add("Remove");
        deque.add("Remove1");
        deque.add("Remove2");

        System.out.println(deque);
        System.out.println(deque.peek());
        deque.remove();
        System.out.println(deque);
        System.out.println(deque);
        while(!deque.isEmpty()){
            deque.poll();
        }
        System.out.println(deque);



    }
}
