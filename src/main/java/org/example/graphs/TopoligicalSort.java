package org.example.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopoligicalSort {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
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

        int[] indegree = new int[V];

        for (int i = 0; i < edges.length; i++) {
            indegree[edges[i][1]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int val = q.poll();

            ans.add(val);

            for (Integer n : adj.get(val)) {
                indegree[n]--;
                if (indegree[n] == 0) {
                    q.add(n);
                }
            }

        }

        return ans;

    }
}
