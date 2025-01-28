package org.example.deque;

import java.util.*;

public class SlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        Deque<Integer> deque = new ArrayDeque<>();
        int[] output = new int[n-k+1];

       // List<Integer> list = new ArrayList<>();

        for(int i = 0;i<k;i++){
            while(!deque.isEmpty() && deque.getLast() < nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }

        output[0] = deque.getFirst();

        int s = 1;
        int e = k;

        while(e<n){
            while (nums[s-1] == deque.getFirst()){
                deque.removeFirst();
            }
            for(int i = s;i<=e;i++){
                while(!deque.isEmpty() && deque.getLast() < nums[i]){
                    deque.removeLast();
                }
                deque.addLast(nums[i]);
            }
           output[s] = deque.getFirst();
            s++;
            e++;
        }


        return output;


    }
}
