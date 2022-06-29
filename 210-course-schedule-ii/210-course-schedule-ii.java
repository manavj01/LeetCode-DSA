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

        for (int i =0; i < numCourses; i++){
            for (Integer it : adj.get(i)){
                indegree[it]++;
            }
        }


        Queue<Integer> que = new LinkedList<>();
        for (int i =0; i<numCourses; i++){
            if (indegree[i] == 0) que.add(i);
        }

        int ind =0;
        while (!que.isEmpty()){
            Integer node = que.poll();
            topo[ind++] = node;

            for (Integer it : adj.get(node)){
                indegree[it]--;
                if (indegree[it] == 0)
                {
                    que.add(it);
                }
            }
        }
        int i=0,j = topo.length-1;
        while (i<j){
            int temp = topo[i];
            topo[i] = topo[j];
            topo[j] = temp;
            i++;
            j--;
        }
        return topo;

    }
    public    boolean detectCycleDFS(int V,  ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        boolean[] dfsVis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(i, vis, dfsVis,  adj)) return true;
            }
        }
        return false;
    }
    public   boolean dfs(int src, boolean[] vis, boolean[] dfsVis,  ArrayList<ArrayList<Integer>> adj) {

        vis[src] = true;
        dfsVis[src] = true;

        for (Integer it : adj.get(src)) {
            if (!vis[it]) {
                if (dfs(it, vis, dfsVis,adj)) return true;
            } else if (dfsVis[it]) {
                return true;
            }
        }
        dfsVis[src] = false;
        return false;
    }}