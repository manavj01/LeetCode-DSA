public class vPair {
TreeNode node;
int vl;
int hl;
​
vPair(TreeNode node, int hl, int vl) {
this.node = node;
this.vl = vl;
this.hl = hl;
}
}
​
public void width(TreeNode root, int hl, int[] width) {
if (root == null) {
return;
}
​
width[0] = Math.min(width[0], hl);
width[1] = Math.max(width[1], hl);
​
width(root.left, hl - 1, width);
width(root.right, hl + 1, width);
}
​
public List<List<Integer>> verticalTraversal(TreeNode root) {
List<List<Integer>> res = new ArrayList<>();
LinkedList<vPair> que = new LinkedList<>();
​
int[] minMax = new int[2];
width(root, 0, minMax);
int len = minMax[1] - minMax[0] + 1;
​
for (int i = 0; i < len; i++) res.add(new ArrayList<>());
vPair rtp = new vPair(root, Math.abs(minMax[0]), 0);
que.addLast(rtp);
while (!que.isEmpty()) {
int size = que.size();
que.sort(
(o1, o2) -> {
if (o1.hl < o2.hl) {
return 1;
} else if (o1.hl > o2.hl) {
return -1;
} else {
return Integer.compare(o1.node.val, o2.node.val);
}