package org.example.neetcode150.dynamicProgramming;

import java.util.Arrays;

public class RobberTwo {


    public int rob(int[] nums) {
        int n = nums.length;


        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2,-1);
        int a = rob(nums, 0, n - 2,dp1);
        int b = rob(nums, 1, n - 1,dp2);
        return Math.max(a,b);
    }

    public int rob(int[] nums, int start, int end,int[] dp) {
        if(end<start){
            return 0;
        }

        if(dp[end] != -1){
            return dp[end];
        }

        int a = nums[end] + rob(nums,start,end-2,dp);
        int b = rob(nums,start,end-1,dp);

        dp[end] = Math.max(a,b);

        return dp[end];
    }
}
