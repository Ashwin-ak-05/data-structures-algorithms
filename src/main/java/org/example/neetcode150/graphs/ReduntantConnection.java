package org.example.neetcode150.graphs;

public class ReduntantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n + 1];
        int[] rank = new int[n + 1];

        int[] lastEdge = new int[2];

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            if (find(parent, u) == find(parent, v)) {
                lastEdge = edge;
            } else {
                union(parent, rank, u, v);
            }
        }
        return lastEdge;
    }

    public int find(int[] parent, int node) {
        if (parent[node] == node) {
            return node;
        }

        return parent[node] = find(parent, parent[node]);
    }

    public void union(int[] parent, int[] rank, int u, int v) {
        int uParent = find(parent, u);
        int vParent = find(parent, v);

        if (rank[uParent] > rank[vParent]) {
            parent[vParent] = parent[uParent];
        } else if (rank[uParent] < rank[vParent]) {
            parent[uParent] = parent[vParent];
        } else {
            parent[uParent] = parent[vParent];
            rank[uParent]++;
        }
    }
}
