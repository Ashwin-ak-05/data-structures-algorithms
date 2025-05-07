package org.example.graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] visited = new int[n];
        Queue<Integer> q = new LinkedList<>();
        Arrays.fill(visited, -1);

        for (int i = 0; i < n; i++) {
            if (visited[i] == -1) {
                if (!bfs(i, graph, visited, q)) {
                    return false;
                }

            }
        }

        return true;

    }

    public boolean bfs(int src, int[][] graph, int[] visited, Queue<Integer> q) {

        q.add(src);
        visited[src] = 0;

        while (!q.isEmpty()) {
            int curr = q.poll();

            // int curr_col = visited[curr];

            int[] neighbors = graph[curr];

            for (int i = 0; i < neighbors.length; i++) {
                int n = neighbors[i];
                if (visited[n] == -1) {
                    if (visited[curr] == 0) {
                        visited[n] = 1;
                    } else {
                        visited[n] = 0;
                    }

                    q.add(n);

                } else {
                    if (visited[curr] == visited[n]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
