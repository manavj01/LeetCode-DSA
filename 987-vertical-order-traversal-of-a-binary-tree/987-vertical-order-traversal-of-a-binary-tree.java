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
        int hl;
        int vl;

        vPair(TreeNode node, int hl, int vl) {
            this.node = node;
            this.hl = hl;
            this.vl = vl;
        }

    }


    public  List<List<Integer>> verticalTraversal(TreeNode root) {
          Queue<vPair> que = new PriorityQueue<>(new Comparator<vPair>() {
            @Override
            public int compare(vPair o1, vPair o2) {
                if (o1.vl < o2.vl){
                    return -1;
                }else if (o1.vl > o2.vl){
                    return 1;
                } else  {
                    return Integer.compare(o1.node.val , o2.node.val);
                }
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

                maxhl = Math.max(maxhl, rp.hl);
                minhl = Math.min(minhl, rp.hl);

                map.putIfAbsent(rp.hl, new ArrayList<>());
                map.get(rp.hl).add(rp.node.val);

                if (rp.node.left != null) {
                    que.add(new vPair(rp.node.left, rp.hl - 1, rp.vl+1));
                }
                if (rp.node.right != null) {
                    que.add(new vPair(rp.node.right, rp.hl + 1,rp.vl+1));
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
