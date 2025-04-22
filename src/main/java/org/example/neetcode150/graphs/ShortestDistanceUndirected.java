package org.example.neetcode150.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceUndirected {
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        int n = adj.size();
        int[] dist = new int[n];

        Arrays.fill(dist, Integer.MAX_VALUE);

        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        dist[src] = 0;

        while(!q.isEmpty()){
            int node = q.poll();
            int d = dist[node];

            for(Integer i : adj.get(node)){
                if(d+1 < dist[i]){
                    dist[i] = d+1;

                    q.add(i);


                }
            }
        }

        for(int i = 0; i<n; i++){
            if(dist[i] == Integer.MAX_VALUE){
                dist[i] = -1;
            }
        }

        return dist;

    }
}
