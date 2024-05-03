package Ds.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
//        Stack<Integer> stack=new Stack<>();
//        stack.push(4);
//        stack.push(5);
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());

//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
        //last one to push will be the first one to pop
        OwnStackClass stack=new OwnStackClass(10);
        stack.push(4);
        stack.push(5);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());




    }
}
