package org.example.neetcode150.dynamicProgramming;

public class CoinChangeTwo {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[2][amount + 1];

        for (int i = 0; i < 2; i++) {
            dp[i][0] = 1;
        }

        for (int j = 1; j <= amount; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j >= coins[i - 1]) {
                    dp[i % 2][j] = dp[(i - 1) % 2][j] + dp[i % 2][j - coins[i - 1]];
                } else {
                    dp[i % 2][j] = dp[(i - 1) % 2][j];
                }
            }
        }

        return dp[n % 2][amount];


    }
}
