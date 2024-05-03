package Ds.stack;

public class GenericImplementedMainMethod {
    public static void main(String[] args) {
        GenericImplementedStackClass<String> str=new GenericImplementedStackClass<>(4);
        str.push("Hello");
        str.push("World");
        str.push("Buenos");
        str.push("Aires");
        System.out.println(str);
        str.pop();
    }
}
