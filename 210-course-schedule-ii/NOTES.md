class Solution {
public int[] findOrder(int numCourses, int[][] prerequisites) {
ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
for (int i = 0 ; i< numCourses; i++){
adj.add(new ArrayList<>());
}
for (int i =0 ; i < prerequisites.length; i++){
adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
}
boolean hasCycle = detectCycleDFS(numCourses,adj);
if(hasCycle){
return new int[0];
};
int[] indegree = new int[numCourses];
int[] topo = new int[numCourses];
​
for (int i =0; i < numCourses; i++){
for (Integer it : adj.get(i)){
indegree[it]++;
}
}
​
​
Queue<Integer> que = new LinkedList<>();
for (int i =0; i<numCourses; i++){
if (indegree[i] == 0) que.add(i);