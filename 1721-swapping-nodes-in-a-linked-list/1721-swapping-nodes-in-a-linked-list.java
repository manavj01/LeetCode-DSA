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
      
        ListNode fn = head;
        ListNode fnp = null;
        ListNode sn = head;
        ListNode snp = null;
        ListNode temp = head;
        ListNode prev = null;
        
        int m = k;
        int n = size(head)-k+1;
        
        while(temp != null){
            
            if(m-- > 0){
                fnp = prev;
                fn = temp;
            }
            if(n-- > 0){
                snp = prev;
                sn = temp;
            }
            prev = temp;
            temp = temp.next;
        }
        
       if(fnp != null) {
        fnp.next = sn;
        
       }else{
            head = sn;
        }
        
        if(snp != null) {
            snp.next = fn;
        }
        else{
            head = fn;
        }
        
        ListNode temp1 = sn.next;
        sn.next = fn.next;
        fn.next = temp1;
        return head;
    }
    
    public int size(ListNode head){
        int size =0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
}