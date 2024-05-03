package Ds.queue;

import java.util.Scanner;

public class LinkedListmplementationOfDeQueueMainMethod {
    public static void main(String[] args) {
        LinkedListImplementationOfDeQueue queue=new LinkedListImplementationOfDeQueue();
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to enter in QUEUE");
        while(num<4) {
            System.out.println("From where ?");
            String pos=sc.nextLine();
            System.out.println("Enter element");
            String s = sc.nextLine();

            if(pos.equalsIgnoreCase("Front")) {
                queue.insertToQueueFirst(s);
                System.out.println(queue.displayQueue());
            }
            else {
                queue.insertToQueue(s);
                System.out.println(queue.displayQueue());
            }
            num++;
        }
        System.out.println(queue.displayQueue());
        System.out.println("Do you want to delete elements in queue ?");
        String n= sc.nextLine();
        if(n.equalsIgnoreCase("YES")){
            System.out.println("From where");
            String input=sc.nextLine();
            if(input.equalsIgnoreCase("Start")) {
                queue.deleteFromQueue();
            }
            else {
                queue.deleteFromLast();
            }
        }
        System.out.println(queue.displayQueue());
        System.out.println("Do you want to delete elements from queue ? ");
        String choice= sc.nextLine();
        System.out.println("From where ?");
        String ch=sc.nextLine();
        if(ch.equalsIgnoreCase("last")){
            queue.deleteFromLast();
        }
        else {
            queue.deleteFromQueue();
        }
        System.out.println(queue.displayQueue());

    }
}
