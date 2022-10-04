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
    public int sumNumbers(TreeNode root) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        
        solve(arr,new ArrayList<Integer>(), root);
        System.out.println(arr);
        int ans =0;
        for(ArrayList<Integer>a : arr){
            int num =0;
            for(int i=0; i<a.size(); i++){
                num = num* 10 + a.get(i);
            }
            ans += num;
        }
        return ans;
        
    }
    public void solve(ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> tba,TreeNode root){
        if(root == null){
            return ;
        }
        tba.add(root.val);

        if(root.left == null && root.right == null){
            arr.add(new ArrayList<>(tba));
        }

        solve(arr,tba,root.left);
        solve(arr,tba,root.right);
        tba.remove(tba.size()-1);

    }
}