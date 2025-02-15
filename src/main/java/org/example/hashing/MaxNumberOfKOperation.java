package org.example.hashing;

import java.util.HashMap;

public class MaxNumberOfKOperation {
    public int maxOperations(int[] arr, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;

        for(int i = 0; i<arr.length; i++){
            if(hashMap.containsKey(k-arr[i])){
                //count += hashMap.get(k-arr[i]);
            }

            if(hashMap.containsKey(arr[i])){
                //int freq = hashMap.get(arr[i]);
                //hashMap.put(arr[i],freq+1);
            }
            else {
                hashMap.put(arr[i],1);
            }
        }
        return count;
    }
}
