package org.example.neetcode150.graphs;

import java.util.*;

public class DijkstraAlgorithm {
    class iPair {
        int first, second;

        iPair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    ArrayList<Integer> dijkstra(ArrayList<ArrayList<iPair>> graph, int src) {
        int n = graph.size();
        PriorityQueue<iPair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.second));
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        pq.add(new iPair(src, 0));

        while (!pq.isEmpty()) {
            iPair vPair = pq.poll();
            int v = vPair.first;
            int vd = vPair.second;
            List<iPair> nodes = graph.get(v);

            for (int i = 0; i < nodes.size(); i++) {
                iPair pair = nodes.get(i);
                int node = pair.first;
                int d = pair.second;

                if (vd + d < dist[node]) {
                    dist[node] = vd + d;
                    pq.add(new iPair(node, dist[node]));
                }
            }
        }


        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(dist[i]);
        }
        return arr;

    }
}
