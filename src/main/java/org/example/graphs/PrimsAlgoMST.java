package org.example.graphs;

import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgoMST {
    static class Pair {
        int edge;
        int weight;

        Pair(int edge, int weight) {
            this.edge = edge;
            this.weight = weight;
        }
    }

    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        boolean[] visited = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);

        int sum = 0;

        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair pair = pq.poll();

            int edge = pair.edge;
            int weight = pair.weight;

            if (visited[edge]) continue;

            visited[edge] = true;
            sum += weight;

            for (int[] n : adj.get(edge)) {

                int v = n[0];
                int w = n[1];

                if (!visited[v]) {
                    pq.add(new Pair(v, w));
                }
            }


        }

        return sum;
    }
}
