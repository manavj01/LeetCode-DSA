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
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode();
        
        dummy.next = head;
        ListNode temp = head;
        
        while(temp != null && temp.next != null){
            if(temp.next.val == temp.val){
                ListNode trav = temp;
                while(trav != null && trav.val == temp.val ){
                    trav = trav.next;
                }
            temp.next = trav;
            }
            
            temp = temp.next;
        }
        
        return head;
    }
}