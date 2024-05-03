package Ds.stack;

import java.util.ArrayList;

public class GenericImplementedStackClass<R>{

    ArrayList<R> list;
    int top=-1;
    int size;

    public GenericImplementedStackClass( int size) {
        this.size = size;
        this.list=new ArrayList<R>(size);
    }

    void push(R data){

        if(top+1 ==size){
            throw new RuntimeException("Stack is Full");
        }
        else{
            top++;
            if(list.size()>top){
                list.set(top,data);
            }
            else{
                list.add(data);
            }
        }
    }

    R peek(){
        if(top==-1){
            throw new RuntimeException("Stack is Empty");
        }
        else{
            return list.get(top);
        }
    }

    void pop(){
        if(top==-1){
            throw new RuntimeException("Stack is Empty");
        }
        else {
            System.out.println("Element Popped : "+list.get(top));
            top--;
        }
    }

    @Override
    public String toString() {
        String val="";
        for(int i=0;i<list.size();i++){
            val=val+String.valueOf(list.get(i)+" ");
        }
        return val;
    }
}
