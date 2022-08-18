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
        int size =0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        
        for(int i=1; i<= size; i++){
            if(i==k){
                a = temp;
            }
            if(i == size-k+1){
                b = temp;
              // temp.val = a.val;  
            } 
            temp = temp.next;
        }
        int value = a.val;
        a.val = b.val;
        b.val = value;
        System.out.println(a.val + " " + b.val);
        return head;
    }
}