It can be done by two ways
​
1) Declaring list outside outside function
ArrayList<Integer> list = new ArrayList<>();
public List<Integer> inorderTraversal(TreeNode root) {
if(root == null){
return list;
}
inorderTraversal(root.left);
list.add(root.val);
inorderTraversal(root.right);
return list;
}
2) creating another function for recursion
class Solution {
public List<Integer> inorderTraversal(TreeNode root) {
List<Integer> res = new ArrayList<>();
helper(root, res);
return res;
}
​
public void helper(TreeNode root, List<Integer> res) {
if (root != null) {
helper(root.left, res);
res.add(root.val);
helper(root.right, res);
}
}
}