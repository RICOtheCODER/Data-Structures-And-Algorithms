package Ds.queue;

import java.util.Queue;

public class CustomQueueMainMethod {
    public static void main(String[] args) {


        CustomQueue queue = new CustomQueue(10);
        queue.insert("Hello");
        queue.insert("Pranit");
        queue.insert("Harsh");
        queue.insert("Ram");
        queue.insert("Ratan");
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
