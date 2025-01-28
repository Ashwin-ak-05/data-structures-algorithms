package org.example;

import java.util.Arrays;

public class LongestPalindromicSubstring {

    String[][] dp;
    public String longestPalindrome(String s) {
        int n = s.length();
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 += s.charAt(i);
        }
        int m = s2.length();
        dp = new String[n][m];
        for(String[] arr : dp){
            Arrays.fill(arr,"-1");
        }
        return palindrome(s,n-1,s2,m-1);

    }

    public String palindrome(String s1, int i, String s2, int j){
        if(i<0 || j<0){
            return "";
        }
        if(dp[i][j] != "-1"){
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j)){
            dp[i][j] =  s1.charAt(i) + palindrome(s1,i-1,s2,j-1);
        }
        else{
            String a = palindrome(s1,i,s2,j-1);
            String b = palindrome(s1,i-1,s2,j);

            if(a.length()>b.length()){
                dp[i][j] = a;
            }
            else {
                dp[i][j] = b;
            }
        }

        return dp[i][j];

    }
}
