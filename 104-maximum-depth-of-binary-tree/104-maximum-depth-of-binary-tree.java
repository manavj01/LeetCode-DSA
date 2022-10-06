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
    // public int maxDepth(TreeNode root) {
    //   if(root == null) return 0;
    //     // Hypothesis
    //     int left = maxDepth(root.left);
    //     int right = maxDepth(root.right);
    //     // Induction
    //     return Math.max(left, right) + 1;
    // }
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        ArrayDeque<TreeNode> dque = new ArrayDeque<>();
        dque.addLast(root);
        int level =0;
        while(!dque.isEmpty()){
            int size = dque.size();
            
            for(int i=0; i<size; i++){
                TreeNode parent = dque.pollFirst();
                // if(parent.left == null && parent.right == null){
                //     return level;
                // }
                if(parent.left != null){
                    dque.addLast(parent.left);
                }
                if(parent.right != null){
                    dque.addLast(parent.right);
                }
            }
            level++;
        }
        
        
        return level;
    }
//  public int maxDepth(TreeNode root){
//         if(root == null) return 0;
        
//         int left = maxDepth(root.left);
//         int right = maxDepth(root.right);
        
//         if(left == 0 || right == 0){
//             return left+right+1;
//         }else{
//         return Math.max(left,right)+1;
//         }
        
//     }
}