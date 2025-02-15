package org.example.Arrays;

public class SumBetweenRange {
    int[] prefix_sum;
    public SumBetweenRange(int[] nums) {
        prefix_sum = new int[nums.length];
        prefix_sum[0] = nums[0];

        for (int i = 1; i<nums.length; i++){
            prefix_sum[i] = prefix_sum[i-1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if(left == 0){
            return prefix_sum[right];
        }
        return prefix_sum[right] - prefix_sum[left-1];
    }
}
