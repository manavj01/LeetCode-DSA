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
//     public TreeNode invertTree(TreeNode root) {
//          if (root == null) {
//             return null;
//         }

//         final TreeNode left = root.left,
//                 right = root.right;
//         root.left = invertTree(right);
//         root.right = invertTree(left);
//         return root;
//     }
    public TreeNode invertTree(TreeNode root) {
        
        if (root == null) {
            return null;
        }

         Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
             TreeNode node = queue.poll();
             TreeNode left = node.left;
            node.left = node.right;
            node.right = left;

            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;
    }
}