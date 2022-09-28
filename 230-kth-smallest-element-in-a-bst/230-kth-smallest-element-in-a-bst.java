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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        solve(root,arr); 
        // Collections.sort(arr);
        
        return arr.get(k-1);
    }
    public void solve(TreeNode root,  ArrayList<Integer> arr ){
        if(root == null) return;
    
        solve(root.left,arr);
        arr.add(root.val);
        solve(root.right,arr);
    }
}