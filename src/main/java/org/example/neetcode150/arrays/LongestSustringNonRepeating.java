package org.example.neetcode150.arrays;

import java.util.HashSet;

public class LongestSustringNonRepeating {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int i = 0;
        int j = 0;
        int ans = 0;

        HashSet<Character> hashSet = new HashSet<>();

        while (j < n) {
            if (!hashSet.contains(s.charAt(j))) {
                hashSet.add(s.charAt(j));
                ans = Integer.max(ans, j - i + 1);
                j++;
            } else {
                hashSet.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
    } 

}
