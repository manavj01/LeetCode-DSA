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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        
       return solve(root,Long.MIN_VALUE, Long.MAX_VALUE );
    }
    
    public boolean solve(TreeNode root,Long min , Long max ){
        if(root == null) return true;
        
        if(root.val <= min || root.val >= max){
            return false;
        }
        
        boolean left = solve(root.left, min, (long)root.val);
        boolean right = solve(root.right, (long)root.val, max);
        
        
        return left && right;
    }
}