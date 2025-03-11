package org.example.neetcode150.heaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
    int n;
    PriorityQueue<Integer> pq;

    public KthLargest(int k, int[] nums) {
        n = k;
        pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
    }

    public int add(int val) {
        pq.add(val);
        int count = 0;

        while (count<n){
            pq.poll();
        }
        return pq.peek();
    }
}
