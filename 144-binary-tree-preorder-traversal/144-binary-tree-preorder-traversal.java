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
    public List<Integer> preorderTraversal(TreeNode root) {

      
       List<Integer> list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (cur!= null || !stack.isEmpty()){

            while (cur!= null){
                                        list.add(cur.val);
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            cur = cur.right;
        }
        // return list;
        // helper(list,root);
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