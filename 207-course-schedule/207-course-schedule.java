class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            adj.get(prerequisite[0]).add(prerequisite[1]);
        }
        boolean hasCycle = detectCycleDFS(numCourses,adj);
        return !hasCycle;
    }
    public static boolean detectCycleDFS(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        boolean[] dfsVis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(i, vis, dfsVis, adj)) return true;
            }
        }
        return false;
    }

    public static boolean dfs(int src, boolean[] vis, boolean[] dfsVis, ArrayList<ArrayList<Integer>> adj) {

        vis[src] = true;
        dfsVis[src] = true;

        for (Integer it : adj.get(src)) {
            if (!vis[it]) {
                if (dfs(it, vis, dfsVis, adj)) return true;
            } else if (dfsVis[it]) {
                return true;
            }
        }
        dfsVis[src] = false;
        return false;
    }
}