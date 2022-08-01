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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         if(list1 == null && list2 == null) return null;
        if(list1 == null) return list2;
                if(list2 == null) return list1;
        ListNode head = new ListNode();
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode ret_head = head;
        while (head1 != null && head2 != null){
            if (head1.val <= head2.val){
                ListNode node = new ListNode();
                
                head.val = head1.val;
            if(head1.next != null){
                head.next = node;
                head = head.next;
            }    
                head1 = head1.next;
            }else {
            ListNode node = new ListNode();
                head.val = head2.val;
                if(head2.next != null){
                head.next = node;
                head = head.next;
                }
                head2 = head2.next;
            }
        }
        while (head1 != null){
            ListNode temp = new ListNode(0);
            temp.val = head1.val;
            head.next = temp;
            head = head.next;
            head1 = head1.next;
        }
        while (head2 != null){
            ListNode temp = new ListNode(0);
            temp.val = head2.val;
            head2 = head2.next;
            head.next = temp;
            head = head.next;
        }
        head.next = null;
        
        return ret_head;
    }
}