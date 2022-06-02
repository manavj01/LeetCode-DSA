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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        
        ListNode temp = head;
        ListNode node = head;
        int c = 0;
        while (temp != null){
            temp = temp.next;
            c++;
        }
        if(c==0){
            return null;
        }else if(c==1){
            return null;
        } else if(c==n){
            head = head.next ;
            return head;
        }
        int kthfromlast = c-n-1;
        while (kthfromlast != 0){
            node = node.next;
            kthfromlast--;
        }
        node.next = node.next.next;
        return head;
}
}