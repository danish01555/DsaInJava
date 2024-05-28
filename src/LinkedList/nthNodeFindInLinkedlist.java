package LinkedList;

public class nthNodeFindInLinkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        //this is your your display code

    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    //this is the one traversal methods
    public static Node nthNode(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(10);
        Node c=new Node(90);
        Node d=new Node(16);
        Node e=new Node(6);
        Node f=new Node(2);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        Node q=nthNode(a,2);
        System.out.println();
        System.out.println(q.data);



    }
}
