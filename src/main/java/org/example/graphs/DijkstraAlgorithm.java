package org.example.graphs;

import java.util.*;

public class DijkstraAlgorithm {
//
//    class iPair {
//        int first, second;
//
//        iPair(int first, int second) {
//            this.first = first;
//            this.second = second;
//        }
//    }


    ArrayList<Integer> dijkstra(ArrayList<ArrayList<iPair>> graph, int src) {
//        int[] ans = new int[graph.size()];
//        ArrayList<Integer> result = new ArrayList<>();
//        Arrays.fill(ans, Integer.MAX_VALUE);
//        PriorityQueue<iPair> pq = new PriorityQueue<>(Comparator.comparing(p -> p.second));
//       // ans[src] = 0;
//        pq.add(new iPair(src, 0));
//
//        while (!pq.isEmpty()) {
//            iPair temp = pq.poll();
//
//            int v = temp.first;
//            int d = temp.second;
//
//            if(ans[v] == Integer.MAX_VALUE){
//                ans[v]=d;
//                ArrayList<iPair> list = graph.get(v);
//                for (int i = 0; i < list.size(); i++) {
//                    iPair pair = graph.get(v).get(i);
//                    if(ans[pair.first] == Integer.MAX_VALUE){
//                        pq.add(new iPair(pair.first, pair.second+d));
//                    }
//                }
//            }
//
//
//        }
//        for (int i = 0; i < ans.length; i++) {
//            result.add(0, ans[i]);
//        }
//        return result;





        int[] ans = new int[graph.size()];
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.fill(ans, Integer.MAX_VALUE);
       // PriorityQueue<iPair> pq = new PriorityQueue<>(Comparator.comparing(p -> p.second));
        Queue<iPair> queue = new LinkedList<>();
        // ans[src] = 0;
        queue.add(new iPair(src, 0));

        while (!queue.isEmpty()) {
            iPair temp = queue.poll();

            int v = temp.first;
            int d = temp.second;

            if(ans[v] == Integer.MAX_VALUE || ans[v] > d){
                ans[v]=d;
                ArrayList<iPair> list = graph.get(v);
                for (int i = 0; i < list.size(); i++) {
                    iPair pair = graph.get(v).get(i);
                    if(ans[pair.first] == Integer.MAX_VALUE){
                        queue.add(new iPair(pair.first, pair.second+d));
                    }
                }
            }


        }
        for (int i = 0; i < ans.length; i++) {
            result.add(0, ans[i]);
        }
        return result;
    }
}
