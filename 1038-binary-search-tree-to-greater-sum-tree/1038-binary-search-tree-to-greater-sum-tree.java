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
    public TreeNode bstToGst(TreeNode node) {
        int sum = 0;

         trav(node,sum);
        return node;
    }
   public int trav(TreeNode root,int sum)
    {
        if(root==null) return sum;
        
       sum =  trav(root.right,sum);
        
        sum += root.val;
        root.val = sum;
        
      sum =  trav(root.left,sum);
       
        return sum;
    }
}