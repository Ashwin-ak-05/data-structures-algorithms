package org.example.neetcode150.graphs;

import java.util.List;
import java.util.PriorityQueue;

public class MinimumSpanningTree {
    static class Pair {
        int edge;
        int weight;

        Pair(int edge, int weight) {
            this.edge = edge;
            this.weight = weight;
        }
    }

    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n];

        int sum = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.weight - y.weight);
        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair pair = pq.poll();
            int edge = pair.edge;
            int weight = pair.weight;
            if (visited[edge]) continue;
            sum += weight;
            visited[edge] = true;

            for (int[] node : adj.get(edge)) {
                int n_edge = node[0];
                int n_weight = node[1];

                if (!visited[n_edge]) {
                    pq.add(new Pair(n_edge, n_weight));
                }
            }
        }
        return sum;
    }
}
