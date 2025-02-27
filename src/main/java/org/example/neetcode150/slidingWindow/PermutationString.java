package org.example.neetcode150.slidingWindow;

import java.util.HashSet;

public class PermutationString {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] s1_map = new int[26];
        int[] s2_map = new int[26];
        int k = s1.length();

        for (int i = 0; i < s1.length(); i++) {
            s1_map[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < k; i++) {
            s2_map[s2.charAt(i) - 'a']++;
        }

        if (match(s1_map, s2_map)) {
            return true;
        }

        int s = 1;
        int e = k;

        while (e < s2.length()) {
            s2_map[s2.charAt(e) - 'a']++;
            s2_map[s2.charAt(s - 1) - 'a']--;
            if (match(s1_map, s2_map)) {
                return true;
            }
            s++;
            e++;
        }

        return false;

    }

    public boolean match(int[] s1, int[] s2) {
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i]) {
                return false;
            }
        }
        return true;
    }
}
