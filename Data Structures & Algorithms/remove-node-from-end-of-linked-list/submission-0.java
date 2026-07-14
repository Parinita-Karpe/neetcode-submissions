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
        ListNode curr=head;
        int c=0;
        ListNode temp=head;
        int num=0;
        while(temp!=null)
        {
            temp=temp.next;
            num+=1;
        }
       if(num==n)
       return head.next;
        while(curr!=null)
        {
            if(c==num-n-1)
            {
                curr.next=curr.next.next;
                break;
            }
            else
            {curr=curr.next;
            c+=1;}
        }
        return head;
    }
}
