package LinkedList;

public class deleteNodeInLinkedlist {
    public static class LinkedlistImpliment{
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
            }
        }
        //insert items
        public static class linkedlist{
            Node head=null;
            Node tail=null;
            void put(int val){
                Node temp=new Node(val);
                if(head==null){
                    head=temp;
                    tail=temp;
                }
                else {
                    tail.next=temp;

                }
                tail=temp;
            }
            void display(){
                Node temp=head;
                while(temp!=null){
                    System.out.println(temp.data+" ");
                    temp=temp.next;
                }
            }

        }
        //this is your insertion code

    }
    public static void main(String[] args) {
      LinkedlistImpliment uu=new LinkedlistImpliment();

    }
}
