package org.example.neetcode150.dynamicProgramming;

public class BuySellCoolDownStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        dp[n][0] = 0;
        dp[n][1] = 0;

        for (int i = n - 1; i >= 0; i--) {
            dp[i][1] = Math.max(-prices[i] + dp[i + 1][0], dp[i + 1][1]);
            if(i+2 <n){
                dp[i][0] = Math.max(prices[i] + dp[i + 2][1], dp[i + 1][0]);
            }
            else{
                dp[i][0] = Math.max(prices[i], dp[i + 1][0]);
            }

        }

        return dp[0][1];
    }
}
