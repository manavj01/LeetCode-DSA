// Stack<TreeNode> st = new Stack<>();
// TreeNode pre = null;
// while (root != null || !st.isEmpty()){
//     while (root != null){
//         st.push(root);
//         root = root.left;
//     }
//     root = st.pop();
//     if(pre != null && pre.val >= root.val) return false;
//     pre = root;
//     root = root.right;
// }
// return true;