/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null,next=null,curr=head;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode temp=new ListNode(-1);
        ListNode trav=temp;
       ListNode fast=head,slow=head;
       while(fast.next!=null && fast.next.next!=null)
       {
           fast=fast.next.next;
           slow=slow.next;
       }
        ListNode firstNode=head;
        ListNode secondNode=reverse(slow.next);
        slow.next=null;

        while(firstNode!=null && secondNode!=null)
        {
            trav.next=firstNode;
            

            firstNode=firstNode.next;
            trav=trav.next;
            trav.next=secondNode;
            secondNode=secondNode.next;

            trav=trav.next;
        }
        if(firstNode!=null)
        trav.next=firstNode;
        
    }
}