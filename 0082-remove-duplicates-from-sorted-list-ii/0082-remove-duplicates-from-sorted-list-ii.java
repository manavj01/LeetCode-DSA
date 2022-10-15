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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ArrayDeque<ListNode> que = new ArrayDeque<>();
        que.addLast(head);
        ListNode temp = head.next;
        while(temp != null){
            if(temp.val == que.getLast().val ){
                while(temp != null && temp.val ==que.getLast().val ){
                    temp = temp.next;
                }
                que.removeLast();
            }
            if(temp != null){
                que.addLast(temp);
                temp = temp.next;
            }
        }
       
        // System.out.println(que.size());
        
        if(que.isEmpty()){
          return null;  
        } else  que.getLast().next = null;
        head = que.removeFirst();
        temp = head;
        System.out.println(que.size());

        while(!que.isEmpty()){
            temp.next = que.pollFirst();
            temp = temp.next;
        }
        return head;
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode left = head;
//         ListNode right = head.next;
        
//         while(right != null){
//            if(right.val == left.val){
//                while(right!= null && right.val == left.val){
//                    right = right.next;
//                }
//            }
//             right = right.next;
//             left = left.next;
            
//         }
        
//         return dummy.next;
    }
}