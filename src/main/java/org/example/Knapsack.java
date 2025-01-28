package org.example;

import java.util.Arrays;

public class Knapsack {

    int[][] dp;

    public int findKnapsack(int maxWeight, int[] weights, int[] values){
        dp = new int[weights.length][maxWeight+1];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        return knapsack(weights.length-1,maxWeight,weights,values);
    }

    public int knapsack(int i, int maxWeight, int[] weights, int[] values){

        if(i<0 || maxWeight<0){
            return 0;
        }
        if(dp[i][maxWeight]!=-1){
            return dp[i][maxWeight];
        }


        if(maxWeight>=weights[i]){
            //if(dp[i][maxWeight]==-1){
                int a = knapsack(i-1,maxWeight-weights[i],weights,values) + values[i];
                int b = knapsack(i-1,maxWeight,weights,values);

                dp[i][maxWeight]=Integer.max(a,b);
            //}
        }
        return dp[i][maxWeight];

    }
}
