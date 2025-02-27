package org.example.neetcode150.arrays;

import java.util.HashMap;

public class LongestRepeatingSubstring {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0;
        int r = 0;
        int maxLen = 0;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        int maxFreq = 0;

        while (r < n) {
            if (hashMap.containsKey(s.charAt(r))) {
                int freq = hashMap.get(s.charAt(r));
                hashMap.put(s.charAt(r), freq + 1);

            } else {
                hashMap.put(s.charAt(r), 1);
            }
            int cur_freq = hashMap.get(s.charAt(r));
            maxFreq = Integer.max(maxFreq, cur_freq);


            int window = r - l + 1;
            if ((window - maxFreq) <= k) {
                maxLen = Integer.max(maxLen, window);

            } else {
                hashMap.put(s.charAt(l), hashMap.get(s.charAt(l)) - 1);

                l++;
            }

            r++;

        }
        return maxLen;
    }
}
