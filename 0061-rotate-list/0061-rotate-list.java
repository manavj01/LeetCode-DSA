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
        if(head == null || k==0) return head;
        ListNode temp = head;
        int size =1;
        while(temp.next != null){
            temp = temp.next;
            size++;
        }
        
        k = k% size;
        ListNode newHead = head;
        for(int i=0; i<size-k-1; i++){
            newHead = newHead.next;
        }
        temp.next = head;
        head = newHead.next;
        newHead.next = null;
        
        return head;
        
    }
}