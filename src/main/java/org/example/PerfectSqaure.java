package org.example;

import java.util.Arrays;

public class PerfectSqaure {
    int[] dp;
    public int numSquares(int n){
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return square(n);

    }

    public int square(int n){

        if(n==0 || n==1){
            return n;
        }

        if(dp[n]==-1){
            int i = 1;
            int val = Integer.MAX_VALUE;

            while(i*i <= n){
                int ans = square(n - i*i);
                val = Integer.min(val,ans+1);

                i++;
            }
            dp[n] = val;
        }

        return dp[n];
    }
}
