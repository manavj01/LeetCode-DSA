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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        ArrayDeque<TreeNode> helper = new ArrayDeque<>();
        helper.add(root);
            
            while(!helper.isEmpty()){
                int size = helper.size();
                ArrayList<Integer> arr = new ArrayList<>();
                for(int i=0; i<size; i++){
                    TreeNode parent = helper.pollFirst();
                    
                    if(parent.left != null){
                        helper.add(parent.left);
                    }
                    if(parent.right != null){
                        helper.add(parent.right);
                    }
                    arr.add(parent.val);
                }
                res.add(new ArrayList<>(arr));
            }
        
       
        Collections.reverse(res);
        return res;
    }
}