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

    public class Pair {
        TreeNode node;
        int vl;
        int hl;

        Pair(TreeNode node, int vl, int hl) {
            this.node = node;
            this.vl = vl;
            this.hl = hl;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        PriorityQueue<Pair> que = new PriorityQueue<>((o1,o2)->{
            if(o1.hl < o2.hl){
                return -1;
            }else if(o1.hl > o2.hl){
                return 1;
            }else{
                return Integer.compare(o1.node.val,o2.node.val);
            }
        });
        HashMap<Integer,  ArrayList<Integer>> map = new HashMap<>();

        que.add(new Pair(root, 0, 0));

        int minvl = 0;
        int maxvl = 0;

        while (!que.isEmpty()) {
            Pair p = que.poll();
            TreeNode node = p.node;
            int vl = p.vl;
            int hl = p.hl;
            minvl = Math.min(minvl, vl);
            maxvl = Math.max(maxvl, vl);

            map.putIfAbsent(vl,new ArrayList<>());
            map.get(vl).add(node.val);
            
            if (node.left != null) {
                que.add(new Pair(node.left, vl - 1, hl + 1));
            }

            if (node.right != null) {
                que.add(new Pair(node.right, vl + 1, hl + 1));
            }
        }

        for(int i = 0 ; i< map.size() ; i++){
            res.add(new ArrayList<>(map.get(minvl++)));
        }
        return res;
    }
}
