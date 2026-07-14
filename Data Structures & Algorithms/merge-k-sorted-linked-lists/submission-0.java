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
//import java.util.ArrayList;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(ListNode head:lists)
        {
            while(head!=null){
            arr.add(head.val);
            head=head.next;
            }
        }
        Collections.sort(arr);
        ListNode dummy=new ListNode(0);
        ListNode result=dummy;
        for(int i:arr)
        {
            result.next=new ListNode(i);
            result=result.next;
        }
        return dummy.next;
    }
}
