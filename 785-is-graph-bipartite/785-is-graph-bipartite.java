class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color, -1);
        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) {
                if (!bfsCheck(graph, i, color)) {
                    return false;
                }
            }
        }
        return true;
    }
     public  boolean bfsCheck(int[][] graph, int src, int[] color) {
        Queue<Integer> que = new LinkedList<>();
        que.add(src);
        color[src] = 1;
        while (!que.isEmpty()) {
            int node = que.poll();
            for (Integer it : graph[node]) {
                if (color[it] == -1) {
                    color[it] = 1 - color[node];
                    que.add(it);
                } else if (color[it] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }
}