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
        // help(root,list);
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return list;
        
    }
    public void dfs(TreeNode root, ArrayList<Integer> list){
        if (root != null){
            dfs(root.left, list);
            list.add(root.val); 
            dfs(root.right, list);
        }
    }
}