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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0 || head.next==null)
        return head;
        
        int c=1;
        ListNode tail=head;
        while(tail.next!=null)
        {
            c++;
            tail=tail.next;
        }
          k=k%c;
        

        tail.next=head;

        k=c-k;
       ListNode lastNode=head;
        while(k>1)
        {
            lastNode=lastNode.next;
            k--;
        }
        head=lastNode.next;
            lastNode.next=null;

        return head;


    }
}