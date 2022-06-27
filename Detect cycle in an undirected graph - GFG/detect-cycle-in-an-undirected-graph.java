// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


class Solution {
    public  class Pair {
        int node;
        int prev;

        Pair(int node, int prev) {
            this.node = node;
            this.prev = prev;
        }
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        
        boolean[] vis = new boolean[V + 1];
        for (int i = 0; i < V; i++) {
            Pair mp = new Pair(i, -1);
            if (!vis[i]) {
                if (cycleDfs(mp, i, adj, vis)) {
                    return true;
                }
            }
        }
        return false;
        
    }
   public  boolean cycleDfs(Pair mp, int src, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[src] = true;

        for (Integer it : adj.get(src)) {

            if (!vis[it]) {
                Pair child = new Pair(it, mp.node);
               if (cycleDfs(child, it, adj, vis)) return true;
            } else if (it != mp.prev && vis[it]) {
                return true;
            }
        }
        return false;
    }
}