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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1=list1;
        ListNode head2=list2;
        ListNode temp=new ListNode();
        ListNode result=temp;
        while(head1!=null && head2!=null)
        {
            
            if(head1.val<head2.val)
            {
                result.next=head1;
                head1=head1.next;
            }
            else
            {
                result.next=head2;
                head2=head2.next;
                
            }
            result=result.next;
        }
        while(head1!=null)
        {
                result.next=head1;
                head1=head1.next;
                result=result.next;
        }
        while(head2!=null)
        {
                result.next=head2;
                head2=head2.next;
                result=result.next;
        }
        return temp.next;
    }
}