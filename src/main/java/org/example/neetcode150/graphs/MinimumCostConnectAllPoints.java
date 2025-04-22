package org.example.neetcode150.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MinimumCostConnectAllPoints {
    class Pair {
        int edge;
        int weight;

        Pair(int edge, int weight) {
            this.edge = edge;
            this.weight = weight;
        }
    }

    public int minCostConnectPoints(int[][] points) {
        List<List<int[]>> graph = new ArrayList<>();
        int n = points.length;
        int sum = 0;
        boolean[] visited = new boolean[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y)->x.weight-y.weight);

        for(int i = 0; i<n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int dist = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1]-points[j][1]);
                graph.get(i).add(new int[]{j,dist});
                graph.get(j).add(new int[]{i,dist});
            }
        }

        pq.add(new Pair(0,0));

        while(!pq.isEmpty()){
            Pair pair = pq.poll();
            int edge = pair.edge;
            int weight = pair.weight;

            if(visited[edge]) continue;
            sum += weight;
            visited[edge] = true;

            for(int[] node : graph.get(edge)){
                int n_edge = node[0];
                int n_weight = node[1];

                if(!visited[n_edge]){
                    pq.add(new Pair(n_edge,n_weight));
                }
            }
        }

        return sum;

    }
}
