package org.example.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DetectCycleUndirectedBFS {
    class Pair {
        int src;
        int parent;

        Pair(int src, int parent) {
            this.parent = parent;
            this.src = src;
        }
    }

    public boolean isCycle(int V, int[][] edges) {
        //int n = edges.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);

        }
        boolean[] visited = new boolean[V];

        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                if (bfs(i, visited, adj)) {
                    return true;
                }
            }
        }

        return false;


    }

    public boolean bfs(int src, boolean[] visited, List<List<Integer>> adj) {


        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(src, -1));
        visited[src] = true;

        while (!q.isEmpty()) {
            Pair pair = q.poll();
            int s = pair.src;
            int p = pair.parent;

            List<Integer> list = adj.get(s);

            for (Integer n : list) {
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(new Pair(n, s));
                } else if (n != p) {
                    return true;
                }
            }


        }
        return false;

    }
}
