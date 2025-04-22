package org.example.neetcode150.dynamicProgramming;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        Boolean[] dp = new Boolean[s.length()];
        return dfs(s, wordSet, 0, dp);
    }

    public boolean dfs(String s, Set<String> wordDict, int start, Boolean[] dp) {
        if (start == s.length()) {
            return true;
        }

        if (dp[start] != null) {
            return dp[start]; // Return cached result
        }

        for (int end = start; end < s.length(); end++) {
            String substring = s.substring(start, end + 1);
            boolean isValid = wordDict.contains(substring);
            if (isValid && dfs(s, wordDict, end + 1, dp)) {
                return dp[start] = true;
            }
        }

        return dp[start] = false;
    }
}
