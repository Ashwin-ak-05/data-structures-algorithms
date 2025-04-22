package org.example.neetcode150.graphs;

import java.util.ArrayList;
import java.util.Stack;

public class CycleDetectionUndirected {
    class Pair{
        int v;
        int p;

        Pair(int v, int p){
            this.v = v;
            this.p = p;
        }
    }

    public boolean isCycle(ArrayList<ArrayList<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];


        for(int i = 0; i<graph.size(); i++){
            if(!visited[i]){
                if(dfs(graph,visited,i,-1)){
                    return true;
                }
            }
        }
        return false;

    }


    public boolean dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int a, int b){
        Stack<Pair> st = new Stack<>();
        st.add(new Pair(a,b));
        while(!st.isEmpty()){
            Pair pair = st.pop();
            int v = pair.v;
            int p = pair.p;
            visited[v] = true;

            for(Integer n : graph.get(v)){
                if(!visited[n]){
                    st.add(new Pair(n,v));
                }
                else{
                    if(n != p){
                        return true;
                    }
                }
            }
        }

        return false;


    }
}
