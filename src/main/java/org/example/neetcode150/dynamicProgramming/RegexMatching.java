package org.example.neetcode150.dynamicProgramming;

public class RegexMatching {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        return match(s, n - 1, p, m - 1);
    }

    public boolean match(String s, int n, String p, int m) {
        if (m < 0) return n < 0;

        if (n >= 0 && (s.charAt(n) == p.charAt(m) || p.charAt(m) == '.')) {
            return match(s, n - 1, p, m - 1);
        }

        if (m > 0 && p.charAt(m) == '*') {
            boolean skip = match(s, n, p, m - 2);
            boolean checkMore = false;
            if (n >= 0 && (s.charAt(n) == p.charAt(m - 1) || p.charAt(m - 1) == '.')) {
                checkMore = match(s, n - 1, p, m);
            }

            return skip || checkMore;
        }

        return false;
    }
}
