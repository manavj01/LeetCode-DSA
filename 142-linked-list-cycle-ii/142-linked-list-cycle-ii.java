/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head == null || head.next == null) return null;
        slow = slow.next;
        fast = fast.next.next;
        
        while(fast != null && fast.next != null){
            if(slow == fast){
                break;
            }slow = slow.next;
                fast = fast.next.next;
            
        }
        
         if (slow != fast)return null;

        slow = head;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}