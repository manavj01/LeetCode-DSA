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
    TreeNode ans ,target;
    public void inorder(TreeNode orig, TreeNode clone){
        if( orig != null){
            inorder(orig.left,clone.left);            
            if(orig == target){
                ans = clone;
            }
            inorder(orig.right,clone.right);

        }
    }
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target = target;
        inorder(original,cloned);
            return ans;
    }
    
    
}