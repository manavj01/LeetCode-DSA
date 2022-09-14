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
public  class vPair {
        TreeNode node;
        int vl;
        int hl;

        vPair(TreeNode node, int hl, int vl) {
            this.node = node;
            this.vl = hl;
            this.hl = vl;
        }

    }


    public  List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<vPair> que = new PriorityQueue<>((o1, o2) -> {
            if (o1.hl < o2.hl){
                return -1;
            }else if (o1.hl > o2.hl){
                return 1;
            } else  {
                return Integer.compare(o1.node.val , o2.node.val);
            }
        });

        Map<Integer, List<Integer>> map = new HashMap<>();
        int minhl = 0, maxhl = 0;

        List<List<Integer>> ans = new ArrayList<>();

        que.add(new vPair(root, 0,0));

        while (que.size() != 0) {
            int size = que.size();

            while (size-- > 0) {
                vPair rp = que.poll();

                maxhl = Math.max(maxhl, rp.vl);
                minhl = Math.min(minhl, rp.vl);

                map.putIfAbsent(rp.vl, new ArrayList<>());
                map.get(rp.vl).add(rp.node.val);

                if (rp.node.left != null) {
                    que.add(new vPair(rp.node.left, rp.vl - 1, rp.hl +1));
                }
                if (rp.node.right != null) {
                    que.add(new vPair(rp.node.right, rp.vl + 1,rp.hl +1));
                }
            }
        }
        for (int i = minhl; i <= maxhl; i++) {
            // Collections.sort(map.get(i));
            ans.add(map.get(i));
        }
        return ans;
    }
}
