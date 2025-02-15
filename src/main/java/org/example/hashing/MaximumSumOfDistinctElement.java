package org.example.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class MaximumSumOfDistinctElement {

    public long maximumSubarraySum(int[] arr, int k) {
        if (arr.length < k) return 0;
        long count = 0;
        long currentSum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();


        for (int i = 0; i < k; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
            currentSum += arr[i];
        }
//        int temp = 0;
//        for (Integer i : hm.keySet()) {
//            if (hm.get(i) > 1) {
//                continue;
//            } else {
//                temp += i;
//            }
//        }
        if (hm.size() == k) {
            count = Math.max(count, currentSum);

        }


        int s = 1;
        int e = k;

        while (e < arr.length) {
            hm.put(arr[s - 1], hm.get(arr[s - 1]) - 1);
            if (hm.get(arr[s - 1]) == 0) {
                hm.remove(arr[s - 1]);
            }
            currentSum -= arr[s-1];

            if (hm.containsKey(arr[e])) {
                hm.put(arr[e], hm.get(arr[e]) + 1);
            } else {
                hm.put(arr[e], 1);
            }
            currentSum += arr[e];

            //temp = 0;

//            for (Integer i : hm.keySet()) {
//                if (hm.get(i) > 1) {
//                    continue;
//                } else {
//                    temp += i;
//                }
//            }
            if (hm.size() == k) {
                count = Math.max(count, currentSum);

            }
            s++;
            e++;
        }

        return count;

    }
}
