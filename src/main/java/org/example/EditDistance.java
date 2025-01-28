package org.example;

import java.util.Arrays;

public class EditDistance {
    int[][] dp;
    public int minDistance(String word1, String word2){
        int n = word1.length();
        int m = word2.length();

        dp = new int[n][m];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        return editDistance(word1,n-1,word2,m-1);

    }

    public int editDistance(String s1,int i, String s2, int j){

        if(i==-1){
            return j+1;
        }
        if(j==-1){
            return i+1;
        }

        if(dp[i][j]==-1){
            if(s1.charAt(i) == s2.charAt(j)){
                dp[i][j] = editDistance(s1,i-1,s2,j-1);
            }
            else {
                int R = 1 + editDistance(s1,i-1,s2,j-1);
                int I = 1 + editDistance(s1,i,s2,j-1);
                int D = 1 + editDistance(s1,i-1,s2,j);

                dp[i][j] = Integer.min(R,Integer.min(I,D));

            }
        }
        return dp[i][j];


    }
}
