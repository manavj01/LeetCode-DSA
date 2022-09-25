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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        int lo = 0;
        int hi = nums.length-1;
        TreeNode root = solve(nums,lo,hi);
        return root;
    }
    public TreeNode solve(int[] nums, int lo, int hi){
        if(lo == hi){
            return new TreeNode(nums[lo]);
        }
        if(lo > hi) return null;
        
        int mid = (lo+hi)/2;
        
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = solve(nums,lo,mid-1);
        root.right = solve(nums,mid+1,hi);
        
        return root;
    }
}
// [1,2,3,4,5,6,7]