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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        int t = left;
        ListNode lptr = head;
        ListNode rptr = head;
        ListNode ltemp = new ListNode(0);
        ltemp.next = head;
        while (--right > 0) {
            if (--left > 0) {
                ltemp = lptr;
                lptr = lptr.next;
            }
            rptr = rptr.next;
        }
        
        ListNode rtemp = rptr.next;

        ListNode currNext = lptr;
        ListNode curr = lptr;
        ListNode prev = ltemp;

        while (curr != rtemp) {
            currNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currNext;
        }

        ltemp.next = rptr;
        lptr.next = rtemp;
        
        if(t==1){
            return rptr;
        }
        return head;
    }

    
}
