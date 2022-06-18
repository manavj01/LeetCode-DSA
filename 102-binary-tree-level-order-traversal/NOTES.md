class Solution {
public List<List<Integer>> levelOrder(TreeNode root) {
Queue<TreeNode> q = new ArrayDeque();
List<List<Integer>> answer = new ArrayList();
if(root==null)return answer;
q.offer(root);
while(!q.isEmpty()){
ArrayList<Integer> levelNodes = new ArrayList();
int levelWidth = q.size();
for(int i=0; i<levelWidth; i++){
if(q.peek().left!=null) q.offer(q.peek().left);
if(q.peek().right!=null) q.offer(q.peek().right);
levelNodes.add(q.poll().val);
}
answer.add(levelNodes);
}
return answer;
}
}