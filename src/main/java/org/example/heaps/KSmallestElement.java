package org.example.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KSmallestElement {
    public int[] findKSmallestElement(int[] arr, int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        int[] ans = new int[arr.length];
        for(int i = 0; i<=k-1;i++){
            priorityQueue.add(arr[i]);
            ans[i] = -1;
        }
        ans[k-1]=priorityQueue.peek();

        for(int i = k; i<arr.length;i++){
            if(arr[i]<=priorityQueue.peek()){
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
                ans[i]=priorityQueue.peek();
            }
            else {
                ans[i] = priorityQueue.peek();
            }
        }
        return ans;
    }
}
