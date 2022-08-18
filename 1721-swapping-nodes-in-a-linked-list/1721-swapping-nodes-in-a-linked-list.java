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
    public ListNode swapNodes(ListNode head, int k) {
       
        ListNode fast = head,slow = head;
        for(int i=1; i<k; i++){
            fast = fast.next;
        }
        ListNode temp = fast;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        
        
        int value = temp.val;
        temp.val = slow.val;
        slow.val = value;
        
        return head;
    }
}