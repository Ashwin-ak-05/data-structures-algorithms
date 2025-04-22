package org.example.neetcode150.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConnectedComponents {
    public ArrayList<ArrayList<Integer>> connectedcomponents(int n, int[][] edges) {
        //int n = edges.size();
        int[] parent = new int[n+1];
        int[] rank = new int[n+1];

        for (int i = 0; i <= n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }




        for(int[] edge : edges){
            union(parent,rank,edge[0],edge[1]);

        }


        Map<Integer, ArrayList<Integer>> hm = new HashMap<>();

        for(int i = 0; i<n; i++){
            int root = find(parent,i);
            hm.computeIfAbsent(root, k -> new ArrayList<>()).add(i);

        }
        return new ArrayList<>(hm.values());
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

//If they asked to return the count
//if (parent[i] == i) { // A node is its own parent -> it's a separate component
//components++;
//        }


