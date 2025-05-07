package org.example.graphs;

public class DisjointSetUnion {
    int[] parent;
    int[] rank;

    public DisjointSetUnion(int n) {
        parent = new int[n + 1];
        rank = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }
    }

    public int find(int node) {
        if (node == parent[node]) {
            return node;
        }
        return parent[node] = find(parent[node]);
    }


    void union(int x, int y) {
        int x_parent = find(x);
        int y_parent = find(y);

        if (x_parent == y_parent) {
            return;
        }

        if (rank[x_parent] > rank[y_parent]) {
            parent[y_parent] = x_parent;
        } else if (rank[x_parent] < rank[y_parent]) {
            parent[x_parent] = y_parent;
        } else {
            parent[y_parent] = x_parent;
            rank[x_parent]++;
        }
    }

}
