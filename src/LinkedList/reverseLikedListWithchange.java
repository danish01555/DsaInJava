package LinkedList;

public class reverseLikedListWithchange {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    //this is your display function
    public static void display(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        display(head.next);

    }
    //this is  your recusivly revrse the list with connection reverse
    public  static Node reverse(Node head){
        if(head.next==null){
            return head;
        }
        Node newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return  newHead;
    }
//    public static Node reverse(LinkNode head){
//        ListNode curr=head;
//        ListNode prev=null;
//        ListNode after=null;
//        while(curr!=null){
//            after=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=after;
//        }
//        return prev;
//    }
//    public int pairSum(ListNode head) {
//        ListNode slow=head;
//        ListNode fast=head;
//        while(fast.next.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        slow.next=reverse(slow.next);
//        int maxSum=0;
//        ListNode head1=head;
//        ListNode head2=slow.next;
//        while(head2!=null){
//            int sum=head1.val + head2.val;
//            if(maxSum<sum){
//                maxSum=sum;
//            }
//            head1=head1.next;
//            head2=head2.next;
//        }
//        return maxSum;


    }
