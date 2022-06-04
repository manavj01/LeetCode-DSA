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
    public ListNode removeElements(ListNode head, int val) {
        ListNode fake = new ListNode(Integer.MIN_VALUE);
        fake.next = head;
        ListNode temp = fake;
        
        
        //  if(temp.val == val){
        //     temp= temp.next;
        // }
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;                
            }
        }
        head = fake.next;
        return head;
    }
}