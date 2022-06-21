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
    public boolean findTarget(TreeNode root, int k) {
       
        
      ArrayList<Integer> list = new ArrayList<>();
          dfs(root, list);
        
        int i =0;
        int j = list.size()-1;
        
        while(i < j){
            int val1 = list.get(i);
            int val2 = list.get(j);
            if(val1 + val2 == k) {
                return true;
            }else if(val1 + val2 < k) {
                i++;
            }else {
                j--;
            }
        }
        return false;
       
    }
    
         public void dfs (TreeNode root, ArrayList<Integer> list){
        
        if(root == null) return  ;
        
        dfs(root.left,list);   
        list.add(root.val);
        dfs(root.right,list);
        
    

    }
}