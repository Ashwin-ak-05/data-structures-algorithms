package org.example.neetcode150.dynamicProgramming;

import java.util.Arrays;

public class LongestInreasingSubsequence {
    int[][] dp;

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new int[n][n + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        // dp = new int[n][n+1];
        // Arrays.fill(dp,-1);

        return dfs(nums, 0, -1);

    }

    public int dfs(int[] nums, int i, int prev) {
        if (i >= nums.length) {
            return 0;
        }

        if (dp[i][prev + 1] != -1) {
            return dp[i][prev + 1];
        }
        int a = Integer.MIN_VALUE;
        if (prev == -1 || nums[i] > nums[prev]) {
            a = 1 + dfs(nums, i + 1, i);
        }
        int b = dfs(nums, i + 1, prev);

        return dp[i][prev + 1] = Math.max(a, b);

    }



    /**
     *  public int lengthOfLIS(int[] nums) {
     *         int n = nums.length;
     *         int[] dp = new int[n];
     *         Arrays.fill(dp, 1);
     *         int max_count = 1;
     *
     *         for (int i = 0; i < n; i++) {
     *             for (int j = 0; j < i; j++) {
     *                 if (nums[i] > nums[j]) {
     *                     dp[i] = Math.max(dp[i], 1 + dp[j]);
     *                     max_count = Math.max(dp[i], max_count);
     *                 }
     *
     *             }
     *         }
     *
     *         return max_count;
     *
     *     }
     */
}
