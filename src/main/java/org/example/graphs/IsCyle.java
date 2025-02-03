package org.example.graphs;

import java.util.ArrayList;

public class IsCyle {
    boolean[] visited;
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    boolean cycle = false;
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj, int A) {
        visited = new boolean[A+1];
        graph = adj;
        if(graph.size()<A){
            for(int i = 1; i<= (A - graph.size())+2; i++){
                graph.add(new ArrayList<>());
            }
        }
//        for(int i = 0; i<A; i++){
//            ArrayList<Integer> list = new ArrayList<>();
//            for(int j = 0; j<adj.get(i).size(); j++){
//                list.add(adj.get(i).get(j));
//            }
//
//            graph.add(list);
//        }

        visited[0] = true;
        dfs(0,-1);
        return cycle;


    }

    void dfs(int v, int p){
        for(int i = 0; i<=graph.get(v).size(); i++){
            int val =  graph.get(v).get(i);
            if(visited[val] && p != val){
                cycle = true;
                break;
            }

            else if(!visited[val]){
                visited[val] =true;
                dfs(val,i);
            }
//            else{
//                i
//                visited[val] = true;
//                dfs(val,v);
//            }
        }
    }
}
