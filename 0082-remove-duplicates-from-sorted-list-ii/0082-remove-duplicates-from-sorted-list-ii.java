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
    public ListNode deleteDuplicates(ListNode head) {
            if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode left = dummy;
        ListNode right = head;
        
        while(right != null){
           
            if(right.next != null && right.val == right.next.val){
               while(right.next != null && right.val == right.next.val){
                   right = right.next;
               }
                left.next = right.next;
           }else{
            left = left.next;
            }
            right = right.next;
            
        }
        
        return dummy.next;
    }
}