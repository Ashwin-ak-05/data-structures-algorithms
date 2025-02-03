package org.example.graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class CompleteComponent {
    boolean[] visited;
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    ArrayList<Integer> temp = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> countCompleteComponents(int n, int[][] edges) {
        int count = 0;
        visited = new boolean[n];
        Arrays.fill(visited,false);
        for(int i = 0; i<n ;i++){
            if(!visited[i]){
                if(temp.size() == 0){
                    result.add(temp);
                    temp = new ArrayList<>();
                }
                //count++;
                temp.add(i);
                dfs(i,edges);
            }
        }
        return result;
    }

    void dfs(int i, int[][] edges){
        for(int j = 0; j<edges[i].length; j++){
            int val = edges[i][j];
            if(!visited[val]){
                visited[val] = true;
                dfs(val,edges);
            }
        }
    }
}
