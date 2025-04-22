package org.example.neetcode150.dynamicProgramming;

public class EditDistance {


    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[2][m + 1];
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= n; i++) {
            dp[i % 2][0] = i;
            for (int j = 1; j <= m; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i % 2][j] = dp[(i - 1) % 2][j - 1];
                } else {
                    int del = 1 + dp[(i - 1) % 2][j];
                    int ins = 1 + dp[i % 2][j - 1];
                    int rem = 1 + dp[(i - 1) % 2][j - 1];

                    dp[i % 2][j] = Math.min(del, Math.min(ins, rem));
                }
            }
        }

        return dp[n%2][m];
    }


}
