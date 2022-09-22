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
    public void flatten(TreeNode root) {
       solve(root);
    }
    TreeNode prev = null;
    public void solve(TreeNode root){
        if(root == null) return ;
        
        solve(root.right);
        solve(root.left);
        
        root.left = null;
        root.right = prev;
       
        prev = root;
       
    }
}