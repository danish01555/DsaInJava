package LinkedList;

public class middleElementInLinkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }


    }
    //this is your display code
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    //this is your middle finding method;
    public static void middleElement(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);

    }

    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(4);
        Node c=new Node(5);
        Node d=new Node(12);
        Node e=new Node(10);

        //this is your linking section of the linkedlist
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println("this is your first linkedlist");
        display(a);
        System.out.println();
        System.out.println();
        //this is your secand node implimentation
        Node a1=new Node(9);
        Node b2=new Node(7);
        a1.next=b2;
        b2.next=c;
        System.out.println("this is your secand linkedlist");
        display(a1);
        System.out.println();
        System.out.println();
        System.out.println("this is your middle element");
        middleElement(a);




    }
}
