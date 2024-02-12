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
        public ListNode reverse(ListNode head){
               ListNode curr=head,prev=null,next=null;

               while(curr!=null)
               {
                  next=curr.next;
                  curr.next=prev;
                  prev=curr;
                  curr=next;
               }
            return prev;
        }
    public boolean isPalindrome(ListNode head) {
            if(head==null || head.next==null)
            return true;

            ListNode fast=head;
            ListNode slow=head;

            while(  fast.next!=null  && fast.next.next!=null)
            {
                fast=fast.next.next;
                slow=slow.next;
            }

            ListNode nn=reverse(slow.next);
            slow.next=null;

            ListNode temp=head;

            while(temp!=null && nn!=null)
            {
                if(temp.val!=nn.val)
                return false;

                temp=temp.next;
                nn=nn.next;
            }
           
            return true;
            
    }
}