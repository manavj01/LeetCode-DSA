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
        Queue<TreeNode> q = new ArrayDeque();
        if (root == null) return new ArrayList<>();
        q.offer(root);
        List<Double> ans = new ArrayList();

        while (!q.isEmpty()) {
            int level_width = q.size();
            double avg = 0.0;
            for (int i = 0; i < level_width; i++) {
                if (q.peek().left != null) {
                    q.offer(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.offer(q.peek().right);
                }
                avg += q.poll().val;
            }
            avg = (double) (avg / level_width);
            ans.add(avg);
        }
        return ans;
    }
}
