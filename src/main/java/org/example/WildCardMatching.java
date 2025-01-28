package org.example;

import java.util.Arrays;

public class WildCardMatching {
    int[][] dp;
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();

        dp=new int[n][m];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        int ans = match(s,n-1,p,m-1);
        if(ans == 1){
            return true;
        }
        return false;
    }

    public int match(String s, int i, String p, int j){

        if(i == -1 && j == -1){
            //dp[i][j] = 1;
            return 1;
        }

        if (i == 0 && j < 0) {
           // dp[i][j] = 1;
           // return dp[i][j];
            return 1;

        }

        if(i==-1 && j==0 && p.charAt(j)=='*'){
//            dp[i][j] = 0;
//            return dp[i][j];
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }



        if(s.charAt(i) == p.charAt(j)){
            dp[i][j] = match(s,i-1,p,j-1);
            return dp[i][j];
        }
        else{
            if(p.charAt(j) == '?'){
                dp[i][j] = match(s,i-1,p,j-1);
                return dp[i][j];
            } else if (p.charAt(j) == '*') {
                for(int k = 0; i-k>0;k++){
                    int ans = match(s,i-k,p,j-1);
                    if(ans == 1){
                        dp[i][j] = 1;
                        return dp[i][j];
                    }
                }
            }
        }

        dp[i][j]=0;
        return dp[i][j];
    }
}
