class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            adj.get(prerequisite[0]).add(prerequisite[1]);
        }
        
        int [] topolist = topoSortBFS(adj,numCourses);
        
        int i = 0, j = topolist.length - 1;
        while (i < j) {
            int temp = topolist[i];
            topolist[i] = topolist[j];
            topolist[j] = temp;
            i++;
            j--;
        }
            return topolist;
        
    }
    public  int[] topoSortBFS(ArrayList<ArrayList<Integer>> adj, int V) {
        int[] indegree = new int[V];
        int[] topo = new int[V];

        for (int i = 0; i < V; i++) {
            for (Integer it : adj.get(i)) {
                indegree[it]++;
            }
        }

        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) que.add(i);
        }
       int c =0;
        int ind = 0;
        while (!que.isEmpty()) {
            Integer node = que.poll();
            topo[ind++] = node;
           c++;
            for (Integer it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    que.add(it);
                }
            }
        }
       if (c < V){
        // to check for cycle if c is less than v there is a cycle
           return new int[0];
       }else{
        return topo;           
       }

    }

}