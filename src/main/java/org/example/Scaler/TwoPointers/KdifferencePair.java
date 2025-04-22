package org.example.Scaler.TwoPointers;

import java.util.Arrays;

public class KdifferencePair {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;

        int p1 = 0;
        int p2 = 1;

        while (p2 < n) {

            if (p1 == p2 || Math.abs(nums[p1] - nums[p2]) < k) {
                p2++;
            } else if (Math.abs(nums[p1] - nums[p2]) > k) {
                p1++;
            } else {
                count++;
                // while(p1+1<p2 && nums[p1]==nums[p1+1]){
                // p1++;
                // }
                while (p2 + 1 < n && nums[p2] == nums[p2 + 1]) {
                    p2++;
                }
                p1++;
                p2++;
            }
        }
        return count;
    }
}
