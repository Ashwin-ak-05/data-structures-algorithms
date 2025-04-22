package org.example.neetcode150.graphs;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
    public void dfs(int[][] edges) {
        Stack<Integer> stack = new Stack<>();
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

        dfsNoStack(list,visited,0);
//
//        stack.add(0);
//        while (!stack.isEmpty()) {
//            int v = stack.pop();
//            System.out.print(v + " -> ");
//            visited[v] = true;
//            for (int n : list.get(v)) {
//                if (!visited[n]) {
//                    stack.add(n);
//                }
//            }
//        }


    }


    void dfsNoStack(List<List<Integer>> graph, boolean[] visited, int v) {
        if(v >= graph.size()){
            return;
        }

        System.out.print(v + " -> ");
       // visited[v] = true;
        for(int n : graph.get(v)){
            if(!visited[n]){
                dfsNoStack(graph,visited,n);
            }
        }
    }
}
