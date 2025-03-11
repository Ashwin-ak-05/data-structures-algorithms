package org.example.neetcode150.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromicPartitioning {
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> partition(String s) {
        List<String> list = new ArrayList<>();
        dfs(s, list, 0);
        return ans;
    }

    public void dfs(String s, List<String> list, int start) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            //if (isPalindrome(s, start, end)) {
            list.add(s.substring(start, end + 1));
            dfs(s, list, end + 1);
            list.removeLast();
            // }
        }


    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }


}
