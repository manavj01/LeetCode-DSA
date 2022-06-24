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
    // public  class BSTPair {
    //     boolean isBst;
    //     int min;
    //     int max;
    // }
    public boolean isValidBST(TreeNode root) {
        
       return isBSTChecker(
                    root, 
                    Long.MIN_VALUE, 
                    Long.MAX_VALUE
                 );
    }
   boolean isBSTChecker(TreeNode root, long min, long max)
   {
       if (root == null)
           return true;
       
       if (root.val <= min || root.val >= max)
           return false;
       
       return isBSTChecker(root.left, min, root.val)
        && isBSTChecker(root.right, root.val, max);
   }
}