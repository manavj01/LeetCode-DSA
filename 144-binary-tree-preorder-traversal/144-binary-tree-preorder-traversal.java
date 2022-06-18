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
    // ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {

        // aproach 1
        //         if(root == null) return list;
        
//         list.add(root.val);
//         preorderTraversal(root.left);        
//         preorderTraversal(root.right);
        
//         return list;
        // aproach 2
        ArrayList<Integer> list = new ArrayList<>();
        helper(list,root);
        return list;
    }
    
    public void helper(ArrayList<Integer> list, TreeNode root){
        if(root != null){
            
        list.add(root.val);
        helper(list,root.left);        
        helper(list,root.right);
        
        }
        
    }
}