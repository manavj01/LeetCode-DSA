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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode temp = head;
        
        while(temp != null){
            arr.add(temp);
            temp = temp.next;
        }
        int lo = 0;
        int hi =arr.size()-1;
        
        TreeNode root = solve(arr,lo,hi);
        return root;
    }
    
    public TreeNode solve(ArrayList<ListNode> arr, int lo, int hi){
        if(lo == hi){
            return new TreeNode(arr.get(lo).val);
        }
        if(lo > hi) return null;
        int mid = (lo+hi)/2;
        
        TreeNode root = new TreeNode(arr.get(mid).val);
        
        root.left = solve(arr,lo,mid-1);
        root.right = solve(arr,mid+1,hi);

        return root;
    }
}