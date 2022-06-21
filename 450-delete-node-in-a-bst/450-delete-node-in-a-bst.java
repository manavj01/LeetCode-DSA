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
    public TreeNode deleteNode(TreeNode node, int key) {
        if(node == null) return null;
        
        if(key < node.val){
            node.left = deleteNode(node.left,key);
        }else if(key > node.val){
            node.right = deleteNode(node.right,key);
        }else {
            if(node.left != null && node.right != null){
                int lm = max(node.left);
                node.val = lm;
                node.left = deleteNode(node.left,lm);
                return node;
            }else if( node.left != null){
                return node.left;
            }else if(node.right != null){
                return node.right;
            }else{
                return null;
            }
        }
            
            return node;
    }
    
    public int max(TreeNode root){
        if(root.right != null){
            return max(root.right);
        }else{
            return root.val;
        }
    }
}