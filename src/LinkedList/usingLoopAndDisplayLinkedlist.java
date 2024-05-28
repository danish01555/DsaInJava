package LinkedList;

public class usingLoopAndDisplayLinkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node temp){
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(9);
        Node b=new Node(4);
        Node c=new Node(5);
        Node d=new Node(1);
        Node e=new Node(4);
        //this is your link setion of linkelist
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //this is your code of output the linkedlist by usin loop
       Node temp=a;
       while (temp != null){
           System.out.print(temp.data+" ");
           temp=temp.next;
       }
       System.out.println();
       display(a);

    }
}
