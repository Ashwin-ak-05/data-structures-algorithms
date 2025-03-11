package org.example.neetcode150.dynamicProgramming;

import java.util.Arrays;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int[][] dp = new int[2][2001];

        dp[0][1000] = 1;

        for(int i = 1; i<=n; i++){
            Arrays.fill(dp[i % 2], 0);
            for(int sum = -1000; sum<=1000;sum++){
                int shiftedIndex = sum + 1000;

                if (shiftedIndex - nums[i-1] >= 0 && shiftedIndex - nums[i-1] <= 2000) {
                    dp[i%2][shiftedIndex] += dp[(i-1)%2][shiftedIndex - nums[i-1]];
                }
                if (shiftedIndex + nums[i-1] >= 0 && shiftedIndex + nums[i-1] <= 2000) {
                    dp[i%2][shiftedIndex] += dp[(i-1)%2][shiftedIndex + nums[i-1]];
                }
            }
        }

        return dp[n%2][target + 1000];


        // for (int[] arr : dp) {
        //     Arrays.fill(arr, -1);
        // }
        // return dfs(nums, target , n - 1, dp,0);
    }

    // public int dfs(int[] nums, int target, int n, int[][] dp, int sum) {
    //     if (n < 0) {
    //         if (sum == target) {
    //             return 1;
    //         }
    //         return 0;
    //     }


    //     if (dp[n][sum + 1000] != -1) {
    //         return dp[n][sum + 1000];
    //     }
    //     int b = dfs(nums, target, n - 1, dp, +nums[n] + sum);
    //     int a = dfs(nums, target, n - 1, dp, -nums[n] + sum);

    //     return dp[n][sum + 1000] = a + b;
    // }
}
