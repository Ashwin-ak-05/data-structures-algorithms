package org.example.neetcode150.dynamicProgramming;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            String palOne = isPalindrome(s, i, i);
            String palTwo = isPalindrome(s, i, i + 1);

            if (palOne.length() > longestPalindrome.length()) {
                longestPalindrome = palOne;
            }
            if (palTwo.length() > longestPalindrome.length()) {
                longestPalindrome = palTwo;
            }
        }
        return longestPalindrome;
    }

    public String isPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
