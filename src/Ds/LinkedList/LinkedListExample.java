package Ds.LinkedList;

import java.util.ArrayList;

public class LinkedListExample {
    public static void main(String[] args) {

      //  ArrayList<Integer> list = new ArrayList<>();
        SInglyLinkedList linkedList=new SInglyLinkedList();
        linkedList.insertLast(34);
        linkedList.insertLast(32);
        linkedList.insertLast(333);
        linkedList.insertLast(321);
        linkedList.insertLast(311);
        linkedList.displayList();
        linkedList.removeFirst();
        linkedList.displayList();

    }

}
