package org.example.neetcode150.arrays;

public class MaximumProfit {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int l = 0;
        int r = 1;
        int max = 0;

        while (r<n){
            int profit = prices[r]-prices[l];
            max = Integer.max(max,profit);
            if(prices[l]>prices[r]){
                l++;
                r++;
            }
            else {
                r++;
            }
        }


        return max;
    }
}
