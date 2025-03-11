package org.example.neetcode150.dynamicProgramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DecodeWays {

    int[] dp;

    public int numDecodings(String s) {
        if (s == null || s.isEmpty()) return 0;
        dp = new int[s.length()+1];
        int n = s.length();

        dp[0] = 0;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;

        for (int i = 2; i <= s.length(); i++) {
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            int twoDigit = Integer.parseInt(s.substring(i - 2, i));

            if (oneDigit >= 1) {  // Valid single digit
                dp[i] += dp[i - 1];
            }
            if (twoDigit >= 10 && twoDigit <= 26) { // Valid two-digit number
                dp[i] += dp[i - 2];
            }
        }
        //Arrays.fill(dp,-1);
        return dp[n];
    }

    public int decode(String s, int i) {
        if (i >= s.length()) return 1;

        if (s.charAt(i) == '0') return 0;

        if (dp[i] != -1) return dp[i];

        int res = decode(s, i + 1);

        if (i + 1 < s.length()) {
            int twoDigit = Integer.parseInt(s.substring(i, i + 2));
            if (twoDigit >= 10 && twoDigit <= 26) {
                res += decode(s, i + 2);
            }
        }

        dp[i] = res;

        return dp[i];
    }
}
