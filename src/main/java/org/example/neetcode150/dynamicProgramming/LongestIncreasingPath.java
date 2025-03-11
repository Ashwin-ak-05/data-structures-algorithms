package org.example.neetcode150.dynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingPath {
    int[][] dp;
    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        dp = new int[n][m];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        int max = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(max,dfs(matrix,i,j));
            }
        }

        return max;


    }


    public int dfs(int[][] matrix, int i, int j) {

        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix.length) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;

        if (i + 1 < matrix.length && matrix[i][j] < matrix[i + 1][j]) {
            a = 1 + dfs(matrix, i + 1, j);
        }
        if (j + 1 < matrix[i].length && matrix[i][j] < matrix[i][j + 1]) {
            b = 1 + dfs(matrix, i, j + 1);
        }

        if (i - 1 >= 0 && matrix[i][j] < matrix[i - 1][j]) {
            c = 1 + dfs(matrix, i - 1, j);
        }

        if (j - 1 >= 0 && matrix[i][j] < matrix[i][j - 1]) {
            d = 1 + dfs(matrix, i, j - 1);
        }


        return dp[i][j] = Math.max(a, Math.max(b, Math.max(c, d)));
    }
}
