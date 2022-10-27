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
    boolean isBal = true;
    public boolean isBalanced(TreeNode node) {
        return  isBalancedHelper(node) != -1;

    }
    
    public int isBalancedHelper(TreeNode node){
        if(node == null) return 0;
        
        int left = isBalancedHelper(node.left);
        if(left == -1) return -1;
        int right = isBalancedHelper(node.right);
        if(right == -1) return -1;

        
        int gap = Math.abs(left-right);
        
        if(gap > 1){
           return -1;
        }
        
        return Math.max(left,right)+1;
    }
}