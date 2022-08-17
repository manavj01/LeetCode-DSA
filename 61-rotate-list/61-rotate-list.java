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
        if(k == 0) return head;
        if(head == null) return null;
        int size =0;
        ListNode sizeTemp = head;
        while(sizeTemp != null ){
            sizeTemp = sizeTemp.next;
            size++;
        }
        k =  k%size;
        if(size == 1 ||  k==0) return head;
        
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        
        ListNode newTail = head;
        ListNode newHead = head;
        for(int i=0; i< size-k-1; i++){
            newTail = newTail.next;
            newHead = newHead.next;
        }
        newHead = newHead.next;
        newTail.next = null;
        tail.next = head;
        
        return  newHead;
    }
}