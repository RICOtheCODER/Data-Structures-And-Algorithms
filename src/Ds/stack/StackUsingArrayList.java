package Ds.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackUsingArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> stack=new ArrayList<>();
        System.out.println("Enter elements to add in Stack");
        int s= sc.nextInt();
        stack.add(s);
        System.out.println("Elements added");
        System.out.println("Want to peek ? ");
        System.out.println(stack);
        System.out.println("Enter 2 to pop");
        int p=sc.nextInt();
        if(p==2){
            System.out.println("Item popped is : "+stack.get(stack.size()-1) );
            stack.remove(stack.size()-1);
        }
        System.out.println(stack);
    }
}
