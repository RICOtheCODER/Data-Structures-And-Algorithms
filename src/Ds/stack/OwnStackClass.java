package Ds.stack;

public class OwnStackClass {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public OwnStackClass(int maxSize){

        this.maxSize=maxSize;
        stackArray=new int[maxSize];
        top=-1;
    }

    public int push(int data){
        if(isFull()){
            throw new RuntimeException("Stack is already Full");
        }
        top++;
        stackArray[top]=data;
        return data;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is already Empty");
        }
        int data=stackArray[top];
        top--;
        return data;
    }
    public int peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==(maxSize-1);
    }
}
