class Solution {
   
     class Pair implements Comparator<Pair> {
        int vertex;
        double probab;

        Pair() {
        }

        Pair(int vertex, double probab) {
            this.vertex = vertex;
            this.probab = probab;
        }
        
        int getV() {
        return vertex;
        }
        
        double getP() {
        return probab;
        }

        public int compare(Pair p1, Pair p2) {
            if (p1.probab < p2.probab){
                return 1;
            }
            else if(p1.probab > p2.probab) {
                return -1;
            }
            else{
                return 0;
            }
        }
    }
    
    public double maxProbability(int V, int[][] edges, double[] succProb, int S, int end) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int i =0 ; i < edges.length; i++) {
            
            int u = edges[i][0];
            int v = edges[i][1];
            double wt = succProb[i];
            
            adj.get(u).add(new Pair(v,wt));            
            adj.get(v).add(new Pair(u,wt));

        }
        
       HashSet<Integer> hs = new HashSet<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(V,new Pair());
        pq.offer(new Pair(S,1.0));
        
        while(!pq.isEmpty()){
            Pair node = pq.poll();
            int vtx = node.vertex;
            double pb = node.probab;
            
            hs.add(vtx);
            
            if(end == vtx) return pb;
            
            if(adj.get(vtx) != null){
                for(Pair it : adj.get(vtx)){
                    if(!hs.contains(it.vertex)){
                        pq.offer(new Pair(it.vertex, pb * it.probab));
                    }
                }
            }
        }
        return 0;
        
    }
}