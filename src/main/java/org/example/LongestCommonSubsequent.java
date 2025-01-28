package org.example;

import java.util.Arrays;

public class LongestCommonSubsequent {

    int[][] dp;

    public int findlcs(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        dp = new int[n][m];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        return lcs(s1,n-1,s2,m-1);
    }

    public int lcs(String s1,int i,String s2,int j){

        if(i<0 || j<0){
            return  0;
        }



        if(dp[i][j]== -1){
            if(s1.charAt(i) == s2.charAt(j)){
                dp[i][j] = 1 + lcs(s1,i-1,s2,j-1);
            }
            else{
                int a = lcs(s1,i,s2,j-1);
                int b = lcs(s1,i-1,s2,j);

                dp[i][j] = Integer.max(a,b);
            }
        }


        return dp[i][j];
    }
}
