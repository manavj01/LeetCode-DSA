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
    public String tree2str(TreeNode root) {
         if (root == null) return "";

        StringBuilder result = new StringBuilder(root.val + "");

        StringBuilder left = new StringBuilder(tree2str(root.left));
        StringBuilder right = new StringBuilder(tree2str(root.right));

        if (left.toString().equals("") && right.toString().equals("")) {
            return result.toString();
        }
        if (left.toString().equals("")) {
            return result.append("()").append("(").append(right).append(")").toString();
        }
        if (right.toString().equals("")) {
            return result.append("(").append(left).append(")").toString();
        }
        return result.append("(").append(left).append(")").append("(").append(right).append(")").toString();
        
//         if (t == null) return "";
        
//         String result = t.val + "";
        
//         String left = tree2str(t.left);
//         String right = tree2str(t.right);
        
//         if (left == "" && right == "")
//             return result;
//         if (left == "")
//             return result + "()" + "(" + right + ")";
//         if (right == "") 
//             return result + "(" + left + ")";
//         return result + "(" + left + ")" + "(" + right + ")";
    }
}