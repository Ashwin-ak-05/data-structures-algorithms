package org.example.hashing;

import java.util.HashSet;

public class SubArrayWithSumZero {
    static boolean findsum(int arr[]) {
        HashSet<Integer> hs = new HashSet<>();
        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        hs.add(pre[0]);

        if(pre[0]==0){
            return true;
        }

        for(int i = 1; i<arr.length; i++){
            pre[i] = pre[i-1] + arr[i];
            if(pre[i]==0){
                return true;
            }
            hs.add(pre[i]);
        }

        if(hs.size() < arr.length){
            return true;
        }
        return false;
    }
}
