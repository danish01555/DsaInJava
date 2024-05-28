package LinkedList;

public class doublyLinkedlist {
    public  static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this .val=val;
        }
    }
    //this is your dispaly section of the code
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    //this is your reverse display a linkedlist code
    public static void displayreverse(Node tail){
        Node temp=tail;
        while(temp !=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();

    }
    //this is the code section of print linkedlist by any number
    public static void displayAtAnyIndex(Node random){
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        display(temp);

    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(3);
        Node c=new Node(5);
        Node d=new Node(9);
        Node e=new Node(10);
        //this is your linking section of the Doublylinkedlist
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        // this is calling of the display function
        System.out.println("this is the our linkedlist");
        display(a);
        //this is calling of the function of reverse the code
        System.out.println("this is your reverse linkedlist");
        displayreverse(e);
        System.out.println("this is your output of the any node to ll");
        displayAtAnyIndex(e);
    }
}
