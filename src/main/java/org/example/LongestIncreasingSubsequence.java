package org.example;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 1;
        Arrays.fill(dp,1);

        int ans = 1;

        for(int i = 1; i < n; i++){
            for(int j = 0; j<i; j++){
                if(nums[i]>nums[j]){
                    dp[i] = Integer.max(dp[i],1+dp[j]);
                }
            }
        }

        for(int a : dp){
            ans = Integer.max(ans,a);
        }
        return ans;




    }
}
