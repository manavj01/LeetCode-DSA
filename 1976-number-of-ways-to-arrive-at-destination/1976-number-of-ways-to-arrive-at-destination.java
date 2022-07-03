class Solution {
     class Edge{
        int node;
        int dist;
        
        Edge(){}
        
        Edge(int node, int dist){
            this.node = node;
            this.dist = dist;
        }
    }
    public int countPaths(int n, int[][] roads) {
         int mod = (int)(Math.pow(10,9) + 7);
        ArrayList<ArrayList<Edge>> adj = new ArrayList<>();
    
        for(int i =0 ; i < n ; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge : roads){
            int from = edge[0];
            int to = edge[1];
            int dist = edge[2];
            
            adj.get(from).add(new Edge(to,dist));            
            adj.get(to).add(new Edge(from,dist));
        }
        
        
        PriorityQueue<Edge> pq = new PriorityQueue<>((aa,bb) -> aa.dist-bb.dist);
        pq.add(new Edge(0,0));
        
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        
        long[] ways = new long[n];
        ways[0] =1;
        
        while(!pq.isEmpty()){
            Edge node = pq.poll();
            int nod = node.node;
            int dst = node.dist;
            
            for(Edge it : adj.get(nod)){
                if((dst + it.dist) < dist[it.node]){
                    ways[it.node] = ways[nod];
                    dist[it.node] = dst + it.dist;
                    pq.offer(new Edge(it.node,dist[it.node]));
                }else if((dst + it.dist) == dist[it.node]){
                     ways[it.node] =ways[it.node] +  ways[nod];
                     ways[it.node] = ways[it.node] % mod;
                }
            }
        }
        return (int)ways[n-1];
    }
}