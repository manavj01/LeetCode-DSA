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
    public List<Integer> inorderTraversal(TreeNode root) {
               ArrayList<Integer> list = new ArrayList<>();
        help(root,list);
        
        return list;
        
    }
    public void help(TreeNode root, ArrayList<Integer> list){
        if (root != null){
            help(root.left, list);
            list.add(root.val); 
            help(root.right, list);
        }
    }
}