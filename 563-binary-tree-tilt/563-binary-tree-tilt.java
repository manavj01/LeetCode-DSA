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
    // static int tilt=0;

    public int findTilt(TreeNode node) {
        int[] ans ={0};
        helper(node,ans);
        return ans[0];
    }

    public int helper(TreeNode node, int[] ans){
         if (node == null) return 0;

        int ls = helper(node.left,ans);

        int rs = helper(node.right,ans);

       
        ans[0] += Math.abs(ls-rs);
        
        

        int ts = ls + rs + node.val;
        return ts;
    }
}