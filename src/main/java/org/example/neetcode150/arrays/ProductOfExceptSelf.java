package org.example.neetcode150.arrays;

public class ProductOfExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];


        answer[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i];
        }

        int suffixSum = nums[nums.length - 1];
        answer[nums.length - 1] = answer[nums.length - 2];

        for (int i = nums.length - 2; i > 0; i--) {
            if (i == 0) {
                answer[0] = suffixSum;
            } else {
                answer[i] = answer[i - 1] * suffixSum;
                suffixSum = suffixSum * nums[i];
            }

        }


        return answer;
    }
}
