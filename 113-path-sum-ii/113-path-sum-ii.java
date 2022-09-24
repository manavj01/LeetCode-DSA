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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        solve(root,res, new ArrayList<>(),0,targetSum);
        return res;
    }
    
    public void solve(TreeNode root,List<List<Integer>> res,ArrayList<Integer> arr, int sum,int target ){
        if(root == null){
            return;
        }   
        arr.add(root.val);
        sum+=root.val;
        if(root.left == null && root.right == null){
          
          if(sum == target)  res.add(new ArrayList<>(arr));
            
        }
        
        solve(root.left,res,arr,sum,target);
        solve(root.right,res,arr,sum,target);
        arr.remove(arr.size()-1);
    }
}