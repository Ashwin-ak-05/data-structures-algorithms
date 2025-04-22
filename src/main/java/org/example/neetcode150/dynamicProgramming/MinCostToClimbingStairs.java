package org.example.neetcode150.dynamicProgramming;

import java.util.Arrays;

public class MinCostToClimbingStairs {
    int[] dp;

    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length + 1];
        Arrays.fill(dp, -1);
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);

        }

        int n = cost.length;
        return Math.min(dp[n-1],dp[n-2]);
        //return calculate(cost, cost.length, 0);
    }

//    public int calculate(int[] cost, int n, int sum) {
//        if (n == 1) {
//            return cost[1];
//        }
//        if (n == 0) {
//            return cost[0];
//        }
//
//        if (dp[n] != -1) {
//            return dp[n];
//        }
//
//        int a = sum + calculate(cost, n - 1, cost[n - 1]);
//        int b = sum + calculate(cost, n - 2, cost[n - 2]);
//
//        dp[n] = Math.min(a, b);
//        return Math.min(a, b);
//    }
}
