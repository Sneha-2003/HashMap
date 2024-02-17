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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
         
        ListNode temp=head;

        while(temp!=null)
        {   
            len++;
            temp=temp.next;
        }
         if(len==1)
         {
             head=null;
              return null;
         }
         if(len==n)
         {
             head=head.next;
             return head;
         }
         int d=len-n;
         temp=head;
         int i=0;
       while(i<d-1)
       {
           i++;
           temp=temp.next;
       }
      if(temp!=null && temp.next!=null)
       temp.next=temp.next.next;

       return head;

    }
}