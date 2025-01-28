package org.example;

import java.util.Arrays;

public class Stairs {

    int[] dp;
    public int climbStairs(int n) {
         dp = new int[n+1];
        Arrays.fill(dp,-1);
        return count(n);


    }

    public int count(int n){
        if(n<=1){
            return 1;
        }

        if(dp[n]==-1){
            dp[n] = count(n-1) + count(n-2);

        }
        return dp[n];
    }
}
