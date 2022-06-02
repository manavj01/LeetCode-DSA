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
    public ListNode deleteMiddle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        ListNode temp = head;
        ListNode counter = head;
        int countnodes = 0;
       // size of linkedlist
        while(counter != null){
            counter = counter.next;
            countnodes++;
        }
        if(countnodes == 1){
            return null;
        }
        // if linklist is odd
        if(countnodes %2 == 1){
             int c = 0;
        while (f.next != null && f !=null){
             f= f.next.next;
             s = s.next;
             c++;
        }
        
        for(int i =1; i<c; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        
        
        }else{ //if linkedlist is even
            int c = 0;
            while(f !=null){
                 f= f.next.next;
                s = s.next;
                c++;
            }
            for(int i =1; i<c; i++){
            temp = temp.next;
            }
                temp.next = temp.next.next;
        }
        
         return head;  
    }
}