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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        ArrayList<Integer> arr = new ArrayList<>();
        solve(root,map);
        
        int maxVal = 0;
        
        for(int key : map.keySet()){
            if(map.get(key) > maxVal){
                maxVal = map.get(key);
            }
        }
        
        for(int key : map.keySet()){
            if(maxVal == map.get(key)){
                arr.add(key);
            }
        }
      
        
        return arr.stream().mapToInt(i -> i).toArray();
    }
    public void solve(TreeNode root , HashMap<Integer,Integer> frequencies){
        if(root == null) return;
        
        frequencies.put(root.val, frequencies.getOrDefault(root.val, 0) + 1);
        solve(root.left,frequencies);
        solve(root.right,frequencies);
    }
}