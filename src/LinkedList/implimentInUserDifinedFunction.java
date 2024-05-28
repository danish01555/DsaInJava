package LinkedList;

public class implimentInUserDifinedFunction {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    //this is your implimentantation of the code
    public static class linkedlist{

        Node head=null;
        Node tail=null;

        void insertAtEnd(int val){
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
        //this is your display code
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
        //this is your code for adding element in beggning
        void StartAdd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        //this is interation the element at fixed index
        void insertat(int idx,int val){
            Node t=new Node(val);
           Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;

            }
            t.next=temp.next;
            temp.next=t;
        }
        //this is method for the get element in the linkedlist
        int getat(int idx){
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;

            }
            return temp.data;
        }
        //this is deletion code for the element in a list
        void deleteat(int idx){
            Node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }




    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(9);

        ll.insertAtEnd(3);
        ll.insertAtEnd(2);


        ll.insertAtEnd(1);
        ll.display();
        ll.StartAdd(2);
        System.out.println();
        ll.display();
        System.out.println();
        ll.insertat(2,4);
        ll.display();
        System.out.println();
        System.out.println();

        System.out.println(ll.getat(2));
        ll.deleteat(2);
        System.out.println();
        ll.display();


    }
}
