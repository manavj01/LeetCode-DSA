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

// [[3]]
// [9 , 20  ]
// [3]
class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        LinkedList<TreeNode> que = new LinkedList<>();
        // res.add(new ArrayList<>(root.val));
        que.add(root);
        int k = 0;
        while (!que.isEmpty()) {
            List<Integer> al = new ArrayList<>();
            int size = que.size();
            k++;
            TreeNode parent = null;

            for (int i = 0; i < size; i++) {
                if (!que.isEmpty()) parent = que.removeFirst();
                al.add(parent.val);
                if (parent.left != null) que.add(parent.left);
                if (parent.right != null) que.add(parent.right);
            }
            if(k % 2 == 0 )Collections.reverse(al);
            
            res.add(al);
            
        }

        return res;
    }
}
