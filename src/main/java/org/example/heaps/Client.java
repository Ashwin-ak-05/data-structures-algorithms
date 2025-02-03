package org.example.heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Client {
    public static void main(String[] args) {
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        priorityQueue.add(1);
//        priorityQueue.add(2);
//        priorityQueue.add(3);
//        priorityQueue.add(4);
//        priorityQueue.add(5);
//
//        while(!priorityQueue.isEmpty()){
//            System.out.print(priorityQueue.poll() + " ");
//        }

//        KSmallestElement kSmallestElement = new KSmallestElement();
//        int[] arr = {5,16,42,12,35,9,4,3};
//        int[] ans = kSmallestElement.findKSmallestElement(arr,4);
//
//        for (int i = 0; i < ans.length; i++) {
//            int an = ans[i];
//            System.out.print(an +" ");
//
//        }
//
//        FractionalKnapsack fractionalKnapsack = new FractionalKnapsack();
//        List<Integer> val = new ArrayList<>(List.of(60, 100, 120));
//        List<Integer> wt = new ArrayList<>(List.of(10, 20, 30));
//        int capacity = 50;
//        double ans = fractionalKnapsack.fractionalKnapsack(val,wt,capacity);
//        System.out.println(ans);

//        ActivitySelection activitySelection = new ActivitySelection();
//        List<Integer> start = new ArrayList<>(List.of(1,3,2,5));
//        List<Integer> end = new ArrayList<>(List.of(2,4,3,6));
//        int ans = activitySelection.activitySelection(start,end);
//        System.out.println(ans);

//        JobScheduling jobScheduling = new JobScheduling();
//        int[] id =  {1,2,3,4};
//        int[] deadline ={2, 1, 2, 1, 1};
//        int[] profit = {100, 19, 27, 25, 15};
//
//        ArrayList<Integer> result = jobScheduling.JobSequencing(id, deadline,profit);
//
//        for (int i = 0; i < result.size(); i++) {
//            int i1 = result.get(i);
//            System.out.print(i1 + " ");
//
//        }

        ActivitySelection activitySelection = new ActivitySelection();
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(activitySelection.eraseOverlapIntervals(intervals));

    }
}
