package Ds.queue;

import java.util.ArrayList;

public class GenericImplementationOfQueue<Q> {
    int front=-1;
    int rear=-1;
    ArrayList<Q> list=new ArrayList<>();
    Q front(){
        if(front==-1){
            return null;
        }
        return list.get(front);
    }

    Q rear(){
        if(rear == -1){
            return null;
        }
        return list.get(rear);
    }

    boolean insert(Q data){
        if(list.isEmpty()){
            front=0;
            rear=0;
            list.add(data);
        }
        else{
            front++;
            if(list.size()>front){
                list.set(front,data);
            }
            else{
                list.add(data);
            }
        }
        System.out.println("Added item is : "+data);
        return true;
    }

    void delete(){
        if(list.isEmpty())
        {
            System.out.println("Queue is Empty");
        } else if (front==rear) {
            front=-1;
            rear=-1;
        }
        else {
            rear++;
        }
    }
    public String toString(){
        String queue="";
        if(list.isEmpty())
        {
            return "";
        }

        else{
            for (int i=rear;i>front;i--){
                queue=queue+String.valueOf(list.get(i)+ " ");
            }

        }
        return queue;
    }

    public static void main(String[] args) {
        GenericImplementationOfQueue<String > queue=new GenericImplementationOfQueue();
        queue.insert("Berlin");
        queue.insert("Tokyo");
        queue.insert("Rome");
        queue.insert("Turin");
        queue.toString();
        queue.delete();
        queue.delete();

    }

}
