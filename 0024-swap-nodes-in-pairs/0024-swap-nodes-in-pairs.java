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

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = swapPairs(head.next.next);

        ListNode cur = head.next;

        cur.next = head;

        head.next = node;

        return cur;
    }

    public ListNode swapPairs1(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp1 = head;
        ArrayList<ListNode> arr = new ArrayList<>();
        while (temp1 != null) {
            arr.add(temp1);
            temp1 = temp1.next;
        }
        for (int i = 0, j = 1; i < j && j < arr.size(); i += 2, j += 2) {
            Collections.swap(arr, i, j);
        }
        for (int i = 1; i < arr.size(); i++) {
            arr.get(i - 1).next = arr.get(i);
        }
        arr.get(arr.size() - 1).next = null;
        return arr.get(0);
    }
}
