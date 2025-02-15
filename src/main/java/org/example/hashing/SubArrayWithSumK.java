package org.example.hashing;

import java.util.HashSet;

public class SubArrayWithSumK {
    public int subarraySum(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        int[] pre = new int[nums.length];
        pre[0] = nums[0];
        hs.add(pre[0]);

        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] + nums[i];
//            if(pre[i]==0){
//                return true;
//            }
            hs.add(pre[i]);
        }
        int count = 0;
        for (int i = 0; i < pre.length; i++) {
            int val = pre[i] - k;
            if (val == 0) {
                count++;
            } else if (hs.contains(val)) {
                count++;
            }
        }
        return count;
    }
}
