package org.example.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopoligicalSort {
    ArrayList<Integer> returnOrder(ArrayList<ArrayList<Integer>> graph){
        int n = graph.size();
        int[] inde_arr = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i< graph.size(); i++){
            ArrayList list = graph.get(i);
            for(int j = 0; j<list.size(); j++){
                int val = graph.get(i).get(j);
                inde_arr[val] = inde_arr[val] + 1;
            }
        }

        for(int i = 0; i < inde_arr.length; i++){
            if(inde_arr[i]==0){
                queue.add(i);
            }
        }


        while (!queue.isEmpty()){
            int temp = queue.poll();
            result.add(temp);
            ArrayList<Integer> list = graph.get(temp);

            for(int i = 0; i<list.size(); i++){
                int val = graph.get(temp).get(i);
                inde_arr[val] = inde_arr[val] - 1;
                if(inde_arr[val] == 0){
                    queue.add(val);
                }
            }
        }
        return result;
    }
}
