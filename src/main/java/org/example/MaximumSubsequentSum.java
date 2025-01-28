package org.example;

import java.util.Arrays;

public class MaximumSubsequentSum {

    int[] dp;

    public int findMaxSum(int[] arr){
        dp = new int[arr.length+1];
        Arrays.fill(dp,-1);
        return maxSum(arr,0);
    }

    public int maxSum(int[] arr, int i){
        if(i>=arr.length){
            return 0;
        }

        if(i == arr.length-1){
            return arr[arr.length-1];
        }
        //[1,2,3,4]
        if(dp[i]==-1){
            int a = arr[i]+maxSum(arr,i+2);
            int b = maxSum(arr,i+1);

            dp[i] = Integer.max(a,b);
        }

        return dp[i];
    }
}
