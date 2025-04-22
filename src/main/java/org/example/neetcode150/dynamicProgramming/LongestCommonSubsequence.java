package org.example.neetcode150.dynamicProgramming;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String s1, String s2) {
        return lcs(s1,s1.length()-1,s2,s2.length()-1);
    }

    public int lcs(String s1, int n1, String s2, int n2) {
        if (n1 < 0 || n2 < 0) {
            return 0;
        }


        if (s1.charAt(n1) == s2.charAt(n2)) {
            return lcs(s1, n1 - 1, s2, n2 - 1) + 1;
        }

        return Math.max(lcs(s1, n1 - 1, s2, n2), lcs(s1, n1, s2, n2 - 1));
    }
}
