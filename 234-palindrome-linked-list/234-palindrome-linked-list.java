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
    public boolean isPalindrome(ListNode head) {
        rleft = head;
        boolean flag = isPalindromeRhelper(head);
        return flag;
    }
    ListNode rleft;
    public  boolean isPalindromeRhelper(ListNode right) {
        if (right == null) {
            return true;
        }
        boolean flag = isPalindromeRhelper(right.next);

       
            if (!flag) {
                return false;
            } else if (right.val != rleft.val) {
                return false;
            }else {
                rleft = rleft.next;
            }
        
        return true;
    }
}