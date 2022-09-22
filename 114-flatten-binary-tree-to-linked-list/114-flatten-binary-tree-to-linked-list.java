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

        // TreeNode prev = null;
        public void flatten(TreeNode root) {
               TreeNode[] arr = new TreeNode[1];
            arr[0] = null;
            solve(root,arr);
        }
    public void solve(TreeNode root ,TreeNode[] arr){
         if(root == null) return ;

            solve(root.right,arr);
            solve(root.left,arr);

            root.left = null;
            root.right = arr[0];

            arr[0] = root;

    }
//     public void flatten(TreeNode root) {
//         if (root == null) return;
//         Stack<TreeNode> st = new Stack<>();
//         st.push(root);
//         TreeNode prev = null;

//         while (!st.isEmpty()) {
//             TreeNode cur = st.peek();
//             st.pop();

//             if (cur.right != null) {
//                 st.push(cur.right);
//             }
//             if (cur.left != null) {
//                 st.push(cur.left);
//             }
//             if (!st.isEmpty()) {
//                 cur.right = st.peek();
//             }
//             cur.left = null;
//         }
//     }
}
