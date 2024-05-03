package Ds.queue;

public class CustomQueue {

    private int maxSize;
    private String[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public CustomQueue(int maxSize){
        this.maxSize=maxSize;
        queueArray=new String[maxSize];
        front=0; //initial position
        rear=-1; //initial position
        nItems=0;
    }

    public boolean insert(String item){
        if(isFull()){
            return false;
        }
        rear++;
        queueArray[rear]=item;
        nItems++;
        return true;
    }
    public String remove(){
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        String item=queueArray[front];
        front++;
        nItems--;
        return item;

    }

    public boolean isEmpty(){
       return nItems==0;
    }

    public boolean isFull(){
      return nItems==maxSize;
    }

    public String peek(){
        return queueArray[front];
        //exit from front
        //insert at rear
    }

}
