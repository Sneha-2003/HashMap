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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode(-1);
        ListNode trav=temp;
         int carr=0;
        while(l1!=null && l2!=null)
        {
           int sum=l1.val+l2.val+carr;

           trav.next=new ListNode(sum%10);
           carr=sum/10;

           trav=trav.next;

           l1=l1.next;
           l2=l2.next;

        }

        if(l1!=null)
        {  while(l1!=null)
        {
            int sum=l1.val+carr;
             trav.next=new ListNode(sum%10);
           carr=sum/10;
           l1=l1.next;
           trav=trav.next;
        }

        }
        if(l2!=null)
        {   while(l2!=null)
        {
            int sum=l2.val+carr;
             trav.next=new ListNode(sum%10);
           carr=sum/10;
           l2=l2.next;
           trav=trav.next;
        }

        }
     if(carr!=0)
     trav.next=new ListNode(carr);

        return temp.next;

    }
}