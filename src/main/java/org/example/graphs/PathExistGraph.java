package org.example.graphs;

import java.util.*;

public class PathExistGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //int[][] graph = new int[n][n];
        List<List<Integer>> graph = new ArrayList<>();
        int[] visited = new int[n];
        Arrays.fill(visited,-1);

        for(List<Integer> arr : graph){
            Collections.fill(arr,-1);
        }

        for(int i = 0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];

//            graph.g[u][v] = 1;
//            graph[v][u] = 1;

            graph.get(u).add(v,1);
            graph.get(v).add(u,1);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = 1;

        while(!queue.isEmpty()){
            int u = queue.poll();

            for(int i = 0; i<graph.size();i++){
                if(graph.get(u).get(i)==1){
                    if(visited[i]==-1){
                        visited[i]=1;
                        queue.add(i);
                    }
                }
            }
        }
        if(visited[destination]==-1){
            return false;
        }
        return true;
    }
}
