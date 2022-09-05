/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {

    public List<List<Integer>> levelOrder(Node root) {
        
        
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Node> que = new LinkedList<>();

        que.offer(root);

        while (!que.isEmpty()) {
            int n = que.size();
            List<Integer> ans = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                Node parent = que.poll();
                ans.add(parent.val);
                for (Node children : parent.children) {
                    que.add(children);
                }
            }
            res.add(ans);
        }

        return res;
    }
}
