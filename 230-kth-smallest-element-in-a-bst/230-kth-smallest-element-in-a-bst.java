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
    public int kthSmallest(TreeNode root, int k) {
        // dfs
        // ArrayList<Integer> arr = new ArrayList<>();
        // dfs(root,arr, k); 
        // return arr.get(k-1);
        
        //bfs
        
        LinkedList<TreeNode> que = new LinkedList<>();
        
            while(true){
                while(root != null){
                    que.addLast(root);
                    root = root.left;
                }
                root = que.removeLast();
                if(--k == 0) return root.val;
                root = root.right;
            }
        
    }
    public void dfs(TreeNode root,  ArrayList<Integer> arr,int k ){
        if(root == null) return;
        if(arr.size() > k) return;
        dfs(root.left,arr,k);
        arr.add(root.val);
        dfs(root.right,arr,k);
    }
}