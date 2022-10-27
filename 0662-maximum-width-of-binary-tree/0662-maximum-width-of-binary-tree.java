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

    public class pair {
        TreeNode node = null;
        int idx = 0;

        pair(TreeNode node, int idx) {
            this.node = node;
            this.idx = idx;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<pair> que = new LinkedList<>();
        int max = Integer.MIN_VALUE;

        que.add(new pair(root, 1));

        while (!que.isEmpty()) {
            int size = que.size();

            int lm = que.getFirst().idx;
            int rm = 0;

            for (int i = 0; i < size; i++) {
                pair p = que.removeFirst();
                rm = p.idx;

                if (p.node.left != null) {
                    que.addLast(new pair(p.node.left, p.idx * 2 + 1));
                }
                if (p.node.right != null) {
                    que.addLast(new pair(p.node.right, p.idx * 2 + 2));
                }
                max = Math.max(rm-lm+1,max);
            }
        }

        return max;
    }
}
