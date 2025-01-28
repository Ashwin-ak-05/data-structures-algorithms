package org.example;

public class SellStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] max = new int[n];
        int[] dp = new int[n];
        //dp[n-1] = prices[n-1];

        int ans = Integer.MIN_VALUE;

        max[n-1] = Integer.MIN_VALUE;


        for(int i = n-2;i>=0;i--){
            max[i] = Integer.max(max[i+1],prices[i+1]);
            dp[i] = max[i] - prices[i];

        }

        for(int a :  dp){
            ans = Integer.max(ans,a);
        }

        if(ans == Integer.MIN_VALUE){
            return 0;
        }



        return ans;
    }
}
