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
   public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) return null;
        Map<Integer, Integer> inMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }

        return helper(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1,
                inMap);
    }

    public TreeNode helper(int[] preorder, int preS, int preE, int[] inorder, int inS, int inE, Map<Integer, Integer> inMap) {
        if (preS > preE || inS > inE) return null;

        TreeNode root = new TreeNode(preorder[preS]);

        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inS;

        root.left = helper(preorder, preS + 1, preS + numsLeft,
                inorder, inS, inRoot - 1, inMap);
        root.right = helper(preorder, preS + numsLeft + 1, preE,
                inorder, inRoot + 1, inE, inMap);

        return root;
    }
}