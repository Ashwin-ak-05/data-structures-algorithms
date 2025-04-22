package org.example.graphs;

import java.util.ArrayList;
import java.util.List;

public class DetectCycleDirectedDFS {
    public boolean isCyclic(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
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
        boolean[] path = new boolean[V];

        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                if (dfs(i, adj, visited, path)) {
                    return true;
                }
            }
        }

        return false;


    }

    public boolean dfs(int src, List<List<Integer>> adj, boolean[] visited, boolean[] path) {
        visited[src] = true;
        path[src] = true;

        List<Integer> neighbours = adj.get(src);

        for (Integer n : neighbours) {
            if (path[n]) {
                return true;
            }
            if (!visited[n]) {
                if (dfs(n, adj, visited, path)) {
                    return true;
                }

            }
        }
        path[src] = false;
        return false;
    }
}
