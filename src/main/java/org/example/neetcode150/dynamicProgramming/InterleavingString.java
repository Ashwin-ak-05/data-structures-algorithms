package org.example.neetcode150.dynamicProgramming;

public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length();
        int m = s2.length();
        if (n + m != s3.length()) {
            return false;
        }

        boolean[][] dp = new boolean[n + 1][m + 1];

        dp[n][m] = true;
        for (int i = n - 1; i >= 0; i--) {
            if (s1.charAt(i) == s3.charAt(i + m)) {
                dp[i][m] = dp[i + 1][m];
            }
        }
        for (int j = m - 1; j >= 0; j--) {
            if (s2.charAt(j) == s3.charAt(j + n)) {
                dp[n][j] = dp[n][j + 1];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                boolean a = false;
                boolean b = false;

                if (s1.charAt(i) == s3.charAt(i + j)) {
                    a = dp[i + 1][j];
                }

                if (s2.charAt(j) == s3.charAt(i + j)) {
                    b = dp[i][j + 1];
                }

                dp[i][j] = a || b;
            }
        }

        return dp[0][0];
    }
}
