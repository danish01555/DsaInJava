package LinkedList;

public class NewLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        //this is your normal initialization code
        Node a=new Node(6);
        Node b=new Node(5);
        Node x=new Node(2);
        Node d=new Node(7);
        Node h=new Node(8);
        // this is your part of the code where we attach
        // things to another
        a.next=b;
        b.next=x;
        x.next=d;
        d.next=h;
        //this is your print the linkedlist
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println("this is your linkedlist");


    }
}
