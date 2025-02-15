package org.example.hashing;

import java.util.HashSet;

public class PairSumK {
    public boolean findPair(int[] arr, int k){
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i<arr.length; i++){
            if(hashSet.contains(k-arr[i])){
                return true;
            }
            else{
                hashSet.add(arr[i]);
            }
        }
        return false;
    }
}


/**
 * int[] arr = {5, 5};
 * int target = 10;
 *
 * If you first add all numbers and then check, target - num (10 - 5 = 5) will always be found in the set, but we must ensure that two distinct indices exist.
 */