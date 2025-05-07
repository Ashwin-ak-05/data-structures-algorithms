package org.example.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopoSortDFS {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            //adj.get(v).add(u);

        }
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, st, visited);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while (!st.isEmpty()) {
            ans.add(st.pop());
        }

        return ans;

    }

    public static void dfs(int src, List<List<Integer>> adj, Stack<Integer> st, boolean[] visited) {
        visited[src] = true;


        for (Integer n : adj.get(src)) {
            if (!visited[n]) {
                dfs(n, adj, st, visited);
            }
        }
        st.push(src);
    }
}
