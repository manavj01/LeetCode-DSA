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
        if(head == null) return null;
        ListNode temp = head;
        ListNode a = new ListNode();

        int size =0;
        while(temp != null){
            
            size++;
              if(size==k){
                a = temp;
            }
            temp = temp.next;
        }
        temp = head;
        ListNode b = new ListNode();
        
        for(int i=1; i<= size; i++){
          
            if(i == size-k+1){
                b = temp;
            } 
            temp = temp.next;
        }
        int value = a.val;
        a.val = b.val;
        b.val = value;
        return head;
    }
}