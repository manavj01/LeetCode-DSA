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

//     public class Pair {
//         long x = Long.MIN_VALUE;
//         long y = Long.MAX_VALUE;

//         Pair(long x, long y) {
//             this.x = x;
//             this.y = y;
//         }

//         Pair() {}
//     }

    public boolean isValidBST(TreeNode root) {
        // Pair rtp = new Pair();
        return solve(root, Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean solve(TreeNode root,long min, long max) {
        if (root == null) return true;

        if (root.val <= min || root.val >= max) {
            return false;
        }

        boolean left = solve(root.left, min, root.val);
        boolean right = solve(root.right,root.val, max);

        return left && right;
    }
}
