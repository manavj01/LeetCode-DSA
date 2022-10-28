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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode();
        HashMap<Integer,Integer> inmap = new HashMap<>();
        
        for(int i=0; i<inorder.length; i++){
            inmap.put(inorder[i],i);
        }
        
        root = solve(0,preorder.length-1,preorder,
                     0, inorder.length-1,inorder,
                    inmap);
        
        return root;
    }
    
    public TreeNode solve(int preS,int preE, int[] preorder, 
                          int inS,int inE, int[] inorder , 
                          HashMap<Integer,Integer> inmap){
        
        if(preS > preE || inS > inE) return null;
        
        TreeNode root = new TreeNode(preorder[preS]);
        
        int rootIdx = inmap.get(root.val);
        int numsLeft = rootIdx - inS;
       
        root.left = solve(preS+1, preS + numsLeft, preorder,inS,rootIdx-1, inorder, inmap);
        root.right = solve(preS + numsLeft + 1,preE, preorder,rootIdx+1 , inE , inorder, inmap);
        
        return root;
    }
}