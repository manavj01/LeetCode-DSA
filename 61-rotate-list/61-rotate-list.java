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
        if (head == null) return null;

        int size = 1;
        ListNode ptr1 = head;
        while (ptr1.next != null) {
            ptr1 = ptr1.next;
            size++;
        }

        k = k % size;
//        if (size == 1 || k == 0) return head;
        
        ListNode newHead = head;
        for (int i = 0; i < size - k - 1; i++) {
            newHead = newHead.next;
        }
        ptr1.next = head;
        head = newHead.next;
        newHead.next = null;
        
        return head;
    }
}