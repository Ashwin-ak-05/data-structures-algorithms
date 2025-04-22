package org.example.neetcode150.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelayTime {
    class Pair {
        int node;
        int distance;

        Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < times.length; i++) {
            int[] time = times[i];
            graph.get(time[0]).add(new int[]{time[1], time[2]});
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);

        pq.add(new Pair(k, 0));

        while (!pq.isEmpty()) {
            Pair pair = pq.poll();
            int node = pair.node;
            int distance = pair.distance;

            for (int[] neighbor : graph.get(node)) {
                int n_node = neighbor[0];
                int n_distance = neighbor[1];

                if (distance + n_distance < dist[n_node]) {
                    dist[n_node] = distance + n_distance;
                    pq.add(new Pair(n_node, distance + n_distance));
                }
            }
        }

        int max = -1;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }
            max = Math.max(max, dist[i]);
        }

        return max;

    }
}
