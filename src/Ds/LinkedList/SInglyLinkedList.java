package Ds.LinkedList;

public class SInglyLinkedList {

    private Node first;
    private Node last;

    public SInglyLinkedList() {
        first=null;
        last=null;
    }
    public void insertLast(int data){
        Node newNode=new Node();
        newNode.data=data;
        if (isEmpty()){
            //if no data is inserted
            first=newNode;
            last=newNode;
        }
        else{
            last.next=newNode;
            last=newNode;
        }
    }
    public boolean isEmpty(){
        return first==null;
    }
    public void displayList(){
        Node current=first;
        do{
            current.displayNode();
            current=current.next;
        }while (current!=null);
    }
    public Node removeFirst(){
        Node temp=first;
        if(first.next==null){
            last=null;
        }
        first=first.next;
        return temp;
    }
    public void insertFirst(int data){
        Node newnode=new Node();
        newnode.data=data;
        if(isEmpty())
        {
            last=newnode;
        }
        newnode.next=first;
        first=newnode;
    }
}
