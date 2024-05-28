package LinkedList;

public class BasicLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        //this is your initializing code
        Node a=new Node(2);
        Node b=new Node(7);
        Node c=new Node(9);
        Node t=new Node(4);
        Node y=new Node(8);
        Node u=new Node(0);
        //this is your linkingy section of linklist
        a.next=b;
        b.next=c;
        c.next=t;
        t.next=y;
        y.next=u;


        //this is your printting Linkedlist code
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);
        System.out.println(a.next.next.next.next.next.data);
    }
}
