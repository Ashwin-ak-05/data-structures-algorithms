package org.example.neetcode150.dynamicProgramming;

import java.util.Arrays;

public class RobberOne {
    int[] dp;

    public int rob(int[] nums) {

        int n = nums.length;
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
//        dp[0] = nums[0];
//        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 0; i < n-3; i++) {
            int a = nums[i] + dp[i+2];
            int b = dp[i+1];
            dp[i] = Math.max(a,b);
        }

        return Math.max(dp[n-1],dp[n-2]);

    }

    public int rob(int[] nums, int n) {
        if (n < 0) {
            return 0;
        }
//        if (n == 0) {
//            return nums[0];
//        }
//        if (n == 1) {
//            return nums[1];
//        }

        if (dp[n%nums.length-1] != -1) {
            return dp[n];
        }

        int a = nums[n] + rob(nums, n - 2);
        int b = rob(nums, n - 1);

        dp[n%nums.length-1] = Math.max(a, b);

        return Math.max(a, b);

    }
}
