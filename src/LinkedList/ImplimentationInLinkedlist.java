package LinkedList;



public class ImplimentationInLinkedlist {

   //this is your normal first stem for implimentation
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    //this is your implimenation of the linkedlist
    public static class lindkedlist{
        Node head=null;
        Node tail=null;
        //this is your insertion code
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head.next=temp;
            }
            else {
                tail.next=temp;
            }
          tail=temp;

        }
        //th is  your display code
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        lindkedlist ll=new lindkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(8);
        ll.insertAtEnd(5);
        ll.display();

    }
}
