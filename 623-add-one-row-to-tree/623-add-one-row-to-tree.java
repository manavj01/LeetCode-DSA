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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode newR = new TreeNode(val);
            newR.left = root;
            return newR;
        }
        solve(root,val,depth, 1);
        return root;
    }
    
    public void solve(TreeNode root,int val , int depth, int height){
        
        if(root == null) return;
        
        if(height == depth-1){
            TreeNode left = root.left;
            TreeNode right = root.right;
            TreeNode tbal = new TreeNode(val);
            TreeNode tbar = new TreeNode(val);
            root.left = tbal;
            tbal.left = left;
            root.right = tbar;
            tbar.right = right;
        }
        
        solve(root.left,val,depth,height+1);
        solve(root.right,val,depth,height+1);

    }
}