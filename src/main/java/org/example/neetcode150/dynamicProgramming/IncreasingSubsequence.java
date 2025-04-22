package org.example.neetcode150.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IncreasingSubsequence {
    List<Integer> ans = new ArrayList<>();
    int count = 0;

    public int lengthOfLIS(int[] nums) {
         int[] dp = new int[nums.length+1];
         Arrays.fill(dp,-1);
         return dfs(nums,0,-1,dp);
    }

    public int dfs(int[] nums, int i,int prev,int[] dp) {
        if(i == nums.length){
            return 0;
        }

        int notake = dfs(nums,i+1,prev,dp);
        int take = 0;

        if(prev == -1 || nums[i]>nums[prev]){
            take = 1 + dfs(nums,i+1,i,dp);
        }


        return Math.max(take,notake);


    }


}
