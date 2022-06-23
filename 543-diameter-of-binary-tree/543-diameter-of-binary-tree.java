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
    public int diameterOfBinaryTree(TreeNode node) {
         if (node == null) return 0;

        // maximum distance between two node of lhs
        int ld = diameterOfBinaryTree(node.left) ;
        // maximum distance between two node of rhs
        int rd = diameterOfBinaryTree(node.right) ;
        // maximum distance between left's deepest and right's deepest
        int f = height(node.left) + height(node.right) + 2;

        return Math.max(ld,Math.max(rd,f));
    }
     public  int height(TreeNode node) {
        
        if (node == null) {
            return -1;
        }
        
        int lh = height(node.left);
        int rh = height(node.right);
        int th = Math.max(lh, rh) + 1;
        return th;

    }
}