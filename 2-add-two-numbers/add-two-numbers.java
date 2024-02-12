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
        ListNode ptr=new ListNode(0);
        ListNode temp=ptr;
        int carry=0;
        while(l1 !=null || l2!=null)
        {   int v1=0,v2=0;
        if(l1!=null)
        v1=l1.val;

        if(l2!=null)
        v2=l2.val;
        
        int sum=v1+v2+carry;
        carry=(sum/10);

        temp.next=new ListNode(sum%10);

       if(l1!=null)
       l1=l1.next;
       if(l2!=null)
       l2=l2.next;

       temp=temp.next;
  
        }
     if(carry>0)
     {
        temp.next=new ListNode(carry);
     }
        return ptr.next;
    }
}