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
    public  boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] vis = new boolean[V + 1];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (cycleBfs(i, adj, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    public  boolean cycleBfs(int src, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {


        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(src, -1));
        vis[src] = true;
        while (!que.isEmpty()) {
            Pair mp = que.poll();
            int node = mp.node;
            int par = mp.prev;
            for (Integer it : adj.get(node)) {
                if (!vis[it]) {
                    que.add(new Pair(it, node));
                    vis[it] = true;
                } else if (par != it) {
                    return true;
                }
            }
        }
        return false;
    }
}