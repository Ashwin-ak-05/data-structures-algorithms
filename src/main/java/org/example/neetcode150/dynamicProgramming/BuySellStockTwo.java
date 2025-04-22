package org.example.neetcode150.dynamicProgramming;

public class BuySellStockTwo {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[2][2];
        dp[n%2][0] = 0;
        dp[n%2][1] = 0;

        for (int i = n - 1; i >= 0; i--) {
            dp[i%2][1] = Math.max(-prices[i] + dp[(i + 1)%2][0], dp[(i + 1)%2][1]);
            dp[i%2][0] = Math.max(prices[i] + dp[(i + 1)%2][1], dp[(i + 1)%2][0]);
        }

        return dp[0][1];

        // for(int[] arr:dp){
        // Arrays.fill(arr,-1);
        // }
        // return dfs(prices, 0, 1,dp);
    }

    // public int dfs(int[] prices, int i, int canBuy, int[][] dp) {
    //     if (i >= prices.length) {
    //         return 0;
    //     }

    //     if (dp[i][canBuy] != -1) {
    //         return dp[i][canBuy];
    //     }

    //     if (canBuy == 1) {
    //         int buy = -prices[i] + dfs(prices, i + 1, 0, dp);
    //         int skip = dfs(prices, i + 1, 1, dp);
    //         return dp[i][canBuy] = Math.max(buy, skip);
    //     } else {
    //         int sell = prices[i] + dfs(prices, i + 1, 1, dp);
    //         int skip = dfs(prices, i + 1, 0, dp);
    //         return dp[i][canBuy] = Math.max(sell, skip);
    //     }
    //     // if(n < 0){
    //     // return 0;
    //     // }

    //     // if(canBuy){
    //     // int buy = -prices[n] + dfs(prices,n-1,false);
    //     // int skip = dfs(prices,n-1,true);
    //     // return Math.max(buy,skip);
    //     // }
    //     // else{
    //     // int sell = prices[n] + dfs(prices,n-1,true);
    //     // int skip = dfs(prices,n-1,false);
    //     // return Math.max(sell,skip);
    //     // }
    // }
}
