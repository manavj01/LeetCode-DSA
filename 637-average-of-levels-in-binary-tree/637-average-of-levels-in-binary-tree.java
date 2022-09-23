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

    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) return new ArrayList<>();
       Queue<TreeNode> q = new ArrayDeque<>();
        List<Double> res = new ArrayList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            double ans = 0;
            
            for(int i=0; i<size; ++i){
                
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                
                ans += q.poll().val;
            }
            res.add((double)ans/size);
        }
        
        
        return res;
        
    }
}
