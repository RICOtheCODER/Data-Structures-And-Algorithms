package Ds.queue;

import java.util.LinkedList;
import java.util.List;

public class LinkedListImplementationOfDeQueue {
    LinkedList<String> list=new LinkedList<>();
    public boolean insertToQueue(String s){
        list.add(s);
        System.out.println("Element added in Queue is : "+s);
        return true;
    }
    public boolean deleteFromQueue(){
        if(!list.isEmpty()){
            list.remove(list.get(0));
            return true;
        }
        else{
            System.out.println("List is Empty");
        }
        return false;
    }
    public String  peekInQueue(){
        return list.get(0);
    }
    public List<String > displayQueue(){
        return list;
    }
    public boolean insertToQueueFirst(String s){
        list.addFirst(s);
        System.out.println("Element added to list First is : "+s);
        return true;

    }
    public boolean deleteFromLast(){
        if(!list.isEmpty()){
            list.removeLast();
            return true;
        }
        else {
            System.out.println("Queue is Empty");
        }
        return false;
    }


}
