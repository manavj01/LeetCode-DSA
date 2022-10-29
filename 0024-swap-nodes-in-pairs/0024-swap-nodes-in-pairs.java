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

    //     public ListNode swapPairs(ListNode head) {
    //         int c = 0;

    //         if (head == null || head.next == null) return head;
    //         ListNode temp1 = head;

    //         while (temp1 != null) {
    //             temp1 = temp1.next;
    //             c++;
    //         }
    //         temp1 = head;
    //         ListNode temp2 = head.next;

    //         ListNode dummy = new ListNode(-1, head);

    //         int size = c / 2;
    //         while (c-- > 0) {
    //             temp1.next = temp2.next;
    //             temp2.next = temp1;
    //         }

    //         return dummy.next;
    //     }
    public ListNode swapPairs(ListNode head) {
        
        if (head == null || head.next == null) return head;
        ListNode temp1 = head;
        ArrayList<ListNode> arr = new ArrayList<>();
        while (temp1 != null) {
            arr.add(temp1) ;
            temp1 = temp1.next;
            
        }
     
        for (int i = 0, j = 1; i < j && j < arr.size(); i += 2, j += 2) {
            Collections.swap(arr,i,j);
            // ListNode t = arr[i];
            // arr[i] = arr[j];
            // arr[j] = t;
        }
        for (int i = 1; i < arr.size(); i++) {
            arr.get(i - 1).next = arr.get(i);
        }
        arr.get(arr.size() - 1).next = null;
        return arr.get(0);
    }
}
