package org.example.neetcode150.arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] arr, int k) {
        int[] pair = new int[2];
        //HashSet<Integer> hashSet = new HashSet<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(k - arr[i])) {
                pair[0] = hm.get(k - arr[i]);
                pair[1] = i;
                return pair;
            } else {
                hm.put(arr[i], i);
            }
        }
        return new int[0];
    }
}
