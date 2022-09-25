/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {

    public Node connect(Node root) {
    if(root == null) return root;
        LinkedList<Node> que = new LinkedList<>();
        que.addLast(root);

        while (!que.isEmpty()) {
            int size = que.size();

            for (int i = 0; i < size; i++) {
                Node parent = que.removeFirst();
                if (parent.left != null) {
                    que.add(parent.left);
                }
                if (parent.right != null) {
                    que.add(parent.right);
                }
                if (i < size - 1) {
                    parent.next = que.getFirst();
                }
            }
        }
        
        return root;
    }
}
