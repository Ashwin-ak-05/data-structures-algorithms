package org.example.neetcode150.graphs;

import java.util.*;

public class BreadthFirstSearch {
    public void bfs(int[][] edges) {
        Queue<Integer> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        boolean[] visited = new boolean[edges.length];
        for (int i = 0; i <= edges.length; i++) {
            list.add(new ArrayList<>());
        }


        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            list.get(u).add(v);
        }

        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " -> ");

            for (int n : list.get(v)) {
                if (!visited[n]) {
                    queue.add(n);
                    visited[n] = true;
                }
            }
        }


    }
}
