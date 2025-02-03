package org.example.graphs;

import java.util.ArrayList;

public class DFSConnected {
    boolean[] visited;
    ArrayList<Integer> result = new ArrayList<>();
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        visited = new boolean[adj.size()];
        visited[0]=true;
        dfs(0,adj);

        return result;

    }


    public void dfs(int v, ArrayList<ArrayList<Integer>> graph){
        for(int i = 0; i < graph.get(v).size(); i++){
           if(!visited[graph.get(v).get(i)]){
               result.add(graph.get(v).get(i));
               visited[graph.get(v).get(i)] = true;
               dfs(graph.get(v).get(i),graph);
           }
        }
    }
}
