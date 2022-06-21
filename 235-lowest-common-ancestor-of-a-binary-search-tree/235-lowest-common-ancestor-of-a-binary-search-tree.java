/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode node, TreeNode n1, TreeNode n2) {
         if(node == null) return null;
	    
        if(n1.val > node.val && n2.val > node.val){
        return lowestCommonAncestor(node.right,n1,n2);
        }else if(n1.val < node.val && n2.val < node.val){
            return lowestCommonAncestor(node.left,n1,n2);
        }else{
            return node;
        }
    }
}