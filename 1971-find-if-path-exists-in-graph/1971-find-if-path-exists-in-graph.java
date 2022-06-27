class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination ) return true;
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++){
            adj.add(new ArrayList<>());
        }
        int edge = edges.length;
        for (int i = 0; i < edge; i++) {
           
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            adj.get(v1).add(v2);
            adj.get(v2).add(v1);
        }
        boolean[] visited = new boolean[n];
         dfs( adj, visited , source, destination);
        return found;
        
    }
    boolean found = false;
    
    public void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited, int source, int dest){
        if(visited[source] || found) return;
        
        visited[source] = true;
        //when we found and neighbour which is equal to end point inside the recursion, voooleeey! break and return the true
        for(int nei : adj.get(source)){
            if(nei == dest){
                found = true;
                break;
            }
            if(!visited[nei])
                dfs(adj, visited, nei, dest); //otherwise deep dig again!
        }
    }
}