package org.example.neetcode150.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<stones.length; i++){
            pq.add(stones[i]);
        }

        while (pq.size()>1){
            int x = pq.poll();
            int y = pq.poll();

            //int newVal;
            if((x-y) != 0){
                pq.add(x-y);
            }
        }

        return pq.peek();


    }
}
